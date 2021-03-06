/**
 * 
 */
package org.gz.mq.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

/**
 * 
 * @author hxj
 * @date 2017年11月13日上午10:58:57
 */
public final class RequestUtils {

	public static String getRemoteIP(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (StringUtils.hasText(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个ip值，第一个ip才是真实ip
			int index = ip.indexOf(",");
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		}
		ip = request.getHeader("X-Real-IP");
		if (StringUtils.hasText(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			return ip;
		}
		return request.getRemoteAddr();
	}
}
