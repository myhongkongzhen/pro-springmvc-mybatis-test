package z.z.w.test.dao.sms ;

import org.apache.ibatis.annotations.Param ;

/**************************************************************************
 * <pre>
 *     FileName: z.z.w.test.dao.MerchantChannelBandMapper.java
 *         Desc: 
 *      @author: Z_Z.W - myhongkongzhen@gmail.com
 *     @version: 2015年9月10日 下午7:25:58 
 *   LastChange: 2015年9月10日 下午7:25:58 
 *      History:
 * </pre>
 **************************************************************************/
public interface MerchantChannelBandMapper
{
	String getChannelCodeByAccount( @Param( value = "merchantAccount" ) String merchantAccount ) ;
}
