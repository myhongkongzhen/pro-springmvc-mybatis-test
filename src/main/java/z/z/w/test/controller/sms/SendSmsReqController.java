package z.z.w.test.controller.sms ;

import javax.annotation.Resource ;
import javax.servlet.http.HttpServletRequest ;

import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;
import org.springframework.context.annotation.Scope ;
import org.springframework.stereotype.Controller ;
import org.springframework.web.bind.annotation.PathVariable ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.ResponseBody ;

import z.z.w.test.service.sms.SendSmsReqService ;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.controller.sms.SendSmsReqController.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015年9月10日 下午7:29:12 
 *   LastChange: 2015年9月10日 下午7:29:12 
 *      History:
 * </pre>
 **************************************************************************/
@Controller
@Scope( value = "prototype" )
@RequestMapping( value = "/smscc" )
public class SendSmsReqController
{
	private static final Logger	logger	= LoggerFactory.getLogger( SendSmsReqController.class ) ;
	
	private SendSmsReqService	sendSmsReqService ;
	
	/**
	 * @return the sendSmsReqService
	 */
	public SendSmsReqService getSendSmsReqService()
	{
		return sendSmsReqService ;
	}
	
	/**
	 * @param sendSmsReqService the sendSmsReqService to set
	 */
	@Resource
	public void setSendSmsReqService( SendSmsReqService sendSmsReqService )
	{
		this.sendSmsReqService = sendSmsReqService ;
	}
	
	/**
	 * http://localhost:8888/smscc/single/thomas.zzw
	 * Create by : 2015年9月10日 下午7:32:04
	 */
	@RequestMapping( value = "/single/{merchantAccount}" , produces = "text/plain;charset=UTF-8" )
	@ResponseBody
	public String smsCheck( @PathVariable String merchantAccount , HttpServletRequest request )
	{
		String code = "FAILD" ;
		try
		{
			logger.info( "[{}][{}]--Request :[{}]-[{}]." , new Object[] { this , sendSmsReqService , merchantAccount } ) ;
			code = sendSmsReqService.getChannelCodeByAccount( merchantAccount ) ;
			logger.info( "{}" , code ) ; ;
		}
		catch ( Exception e )
		{
			logger.error( "sms check error : [{}]." , e.getMessage() , e ) ;
			return code ;
		}
		return code ;
	}
}
