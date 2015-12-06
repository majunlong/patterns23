package pattern10.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import sun.misc.ProxyGenerator;

/**
 * 代理处理程序
 */

@SuppressWarnings("restriction")
public class ProxyHandler implements InvocationHandler {

	private Object obj;

	private ProxyHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(args[0] + "登录QQ");
		Object result = null;
		try {
			result = method.invoke(this.obj, args);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(args[0] + "退出QQ");
		return result;
	}

	/**
	 * 创建代理
	 */
	@SuppressWarnings("unchecked")
	public static <C> C createProxy(Class<C> implClass) {
		try {
			return (C) Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(), new ProxyHandler(implClass.newInstance()));
		} catch (IllegalArgumentException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static class ProxyClassLoader extends ClassLoader {

		private byte[] bytes;

		public ProxyClassLoader(byte[] bytes) {
			this.bytes = bytes;
		}

		@Override
		protected Class<?> findClass(String className) {
			return super.defineClass(className, this.bytes, 0, this.bytes.length);
		}

	}

	/**
	 * 创建代理
	 */
	@SuppressWarnings("unchecked")
	public static <C> C instanceProxy(Class<C> implClass) {
		byte[] bytes = ProxyGenerator.generateProxyClass(implClass.getName() + "Proxy", implClass.getInterfaces());
		try {
			Class<?> proxyClass = new ProxyClassLoader(bytes).loadClass(implClass.getName() + "Proxy");
			Constructor<?> proxyConstructor = proxyClass.getConstructor(InvocationHandler.class);
			return (C) proxyConstructor.newInstance(new ProxyHandler(implClass.newInstance()));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 创建代理类文件
	 */
	public static <C> void createProxyFile(String filePath, Class<C> implClass) {
		byte[] bytes = ProxyGenerator.generateProxyClass(implClass.getName() + "Proxy", implClass.getInterfaces());
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(new File(filePath + implClass.getSimpleName() + "Proxy.class"));
			os.write(bytes, 0, bytes.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
				}
			}
		}
	}

}
