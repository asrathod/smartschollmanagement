/**
 * 
 */
package com.smartschool.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author Anand_Rathod
 *
 */
 
public class SessionUtil {

	public static long getUserId(HttpServletRequest request){
		long value = 0;
		try{
			Object userId = request.getSession().getAttribute("userId");
			if(userId != null){
				value = Long.parseLong(userId.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static String getUserEid(HttpServletRequest request){
		String value = null;		
		try{
			Object sessionUserEid = request.getSession().getAttribute("userEid");
			if(sessionUserEid != null){
				value = sessionUserEid.toString();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}

	public static String getFirstName(HttpServletRequest request){
		String value = null;		
		try{
			Object sessionUserFirstName = request.getSession().getAttribute("firstName");
			if(sessionUserFirstName != null){
				value = sessionUserFirstName.toString();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static String getMidleName(HttpServletRequest request){
		String value = null;
		try{
			Object sessionUserMidleName = request.getSession().getAttribute("midileName");
			if(sessionUserMidleName != null){
				value = sessionUserMidleName.toString();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}

	public static String getLastName(HttpServletRequest request){
		String value = null;		
		try{
			Object sessionUserLastName = request.getSession().getAttribute("lastName");
			if(sessionUserLastName != null){
				value = sessionUserLastName.toString();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static String getUserEmail(HttpServletRequest request){
		String value = null;		
		try{
			Object sessionUserEmail = request.getSession().getAttribute("userEmail");
			if(sessionUserEmail != null){
				value = sessionUserEmail.toString();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static long getDepartmentId(HttpServletRequest request){
		long value = 0;
		try{
			Object userId = request.getSession().getAttribute("departmentId");
			if(userId != null){
				value = Long.parseLong(userId.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static long getManagerId(HttpServletRequest request){
		long value = 0;
		try{
			Object managerId = request.getSession().getAttribute("managerId");
			if(managerId != null){
				value = Long.parseLong(managerId.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static long getLocationId(HttpServletRequest request){
		long value = 0;
		try{
			Object locationId = request.getSession().getAttribute("locationId");
			if(locationId != null){
				value = Long.parseLong(locationId.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static long getRoleId(HttpServletRequest request){
		long value = 0;
		try{
			Object roleId = request.getSession().getAttribute("roleId");
			if(roleId != null){
				value = Long.parseLong(roleId.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static long getStudentId(HttpServletRequest request){
		long value = 0;
		try{
			Object roleId = request.getSession().getAttribute("stdentId");
			if(roleId != null){
				value = Long.parseLong(roleId.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
}
