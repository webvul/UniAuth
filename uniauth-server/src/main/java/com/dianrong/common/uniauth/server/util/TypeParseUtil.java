package com.dianrong.common.uniauth.server.util;

import com.dianrong.common.uniauth.common.bean.InfoName;
import com.dianrong.common.uniauth.server.exp.AppException;

/**.
 * 类型转变相关的工具方法.
 * @author wanglin
 *
 */
public class TypeParseUtil {
	
	/**.
	 * 从object转换成Long，不然就报错抛出去
	 * @return
	 */
	public static Long paraseToLongFromObject(Object val){
		if(val == null){
			throw new AppException(InfoName.VALIDATE_FAIL, UniBundle.getMsg("datafilter.typeparase.null.poniter"));
		}
		Long result = null;
		try{
			result = Long.parseLong(val.toString());
		} catch(Exception ex){
			throw new AppException(InfoName.VALIDATE_FAIL, UniBundle.getMsg("datafilter.typeparase.parase.error", val , "Long"));
		}
		return result;
	}
	
	/**.
	 * 从object转换成String，不然就报错抛出去
	 * @return
	 */
	public static String paraseToStringFromObject(Object val){
		if(val == null){
			throw new AppException(InfoName.VALIDATE_FAIL, UniBundle.getMsg("datafilter.typeparase.null.poniter"));
		}
		String result = null;
		try{
			result = String.valueOf(val);
		} catch(Exception ex){
			throw new AppException(InfoName.VALIDATE_FAIL, UniBundle.getMsg("datafilter.typeparase.parase.error", val , "String"));
		}
		return result;
	}
}
