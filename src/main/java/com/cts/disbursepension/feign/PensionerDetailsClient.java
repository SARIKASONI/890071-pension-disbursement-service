package com.cts.disbursepension.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.disbursepension.model.PensionerDetail;

/**
 * Feign Client which handles REST API calls to pension-detail-microservice
 * 
 *  @author Sarika Soni
 *  @author 890071
 *
 */
@FeignClient(name = "PENSIONER-DETAIL-SERVICE", url = "${url.app.psdtservice}")
public interface PensionerDetailsClient {
	/**
	 * method to get pensioner details by aadhaar number
	 * 
	 * @param aadhaarNumber
	 * @return PensionerDetail
	 * 
	 */
	@GetMapping("/pensionerDetailByAadhaar/{aadhaarNumber}")
	PensionerDetail pensionerDetailByAadhaar(@PathVariable String aadhaarNumber);

}
