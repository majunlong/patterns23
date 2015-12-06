package pattern06.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 影片类型存储库
 */

public class FilmTypeRepository {

	private final static Map<String, FilmType> repository = new HashMap<String, FilmType>();

	/**
	 * 获取影片类型
	 * 
	 * @param key 键
	 * @return 影片类型
	 */
	public static FilmType get(String key) {
		FilmType value = repository.get(key);
		if (value == null) {
			value = new FilmType(key);
			repository.put(key, value);
		}
		return value;
	}

	/**
	 * 计算容量
	 * 
	 * @return 容量
	 */
	public static int size() {
		return repository.size();
	}

}
