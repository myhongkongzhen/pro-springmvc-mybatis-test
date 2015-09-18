package z.z.w.test.service.sms ;

import javax.annotation.Resource ;

import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;
import org.springframework.context.annotation.Scope ;
import org.springframework.stereotype.Service ;

import z.z.w.test.dao.sms.MerchantChannelBandMapper ;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.service.sms.SendSmsReqService.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015年9月10日 下午7:30:48 
 *   LastChange: 2015年9月10日 下午7:30:48 
 *      History:
 * </pre>
 **************************************************************************/
@Service
@Scope( value = "prototype" )
public class SendSmsReqService
{
	private static final Logger			logger	= LoggerFactory.getLogger( SendSmsReqService.class ) ;
	
	private MerchantChannelBandMapper	merchantChannelBandMapper ;
	
	public String getChannelCodeByAccount( String merchantAccount )
	{
		logger.info( "{}" , merchantChannelBandMapper ) ;
		return merchantChannelBandMapper.getChannelCodeByAccount( merchantAccount ) ;
	}
	
	/**
	 * @return the merchantChannelBandMapper
	 */
	public MerchantChannelBandMapper getMerchantChannelBandMapper()
	{
		return merchantChannelBandMapper ;
	}
	
	/**
	 * @param merchantChannelBandMapper the merchantChannelBandMapper to set
	 */
	@Resource
	public void setMerchantChannelBandMapper( MerchantChannelBandMapper merchantChannelBandMapper )
	{
		this.merchantChannelBandMapper = merchantChannelBandMapper ;
	}
	
}
