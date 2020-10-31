package com.wynk.assignment.ros.web.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wynk.assignment.ros.model.request.ItemInfo;
import com.wynk.assignment.ros.model.response.CommonResponseBean;

@RestController
public class SabirSampleController {

	/**
	 * @return
	 */
	@PostMapping(value = "/product", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE } )
	// For post data, refer to /assign-order API
	public ResponseEntity<CommonResponseBean> addProduct() {
		HttpStatus httpStaus = HttpStatus.CREATED;
		ResponseEntity<CommonResponseBean> respEntity = new ResponseEntity<>(httpStaus);
		// If you want to send a response body, do it like this:
		// CommonResponseBean respBean = new CommonResponseBean();
		// respBean.setErrCode(1000);
		// ResponseEntity<CommonResponseBean> respEntity = new ResponseEntity<>(respBean, httpStaus);
		return respEntity;
	}
	
	@GetMapping(value = "/product/{id}", produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> fetchProduct(@PathVariable("id") Long id) {
		HttpStatus httpStaus = HttpStatus.OK;
		ResponseEntity<CommonResponseBean> respEntity = new ResponseEntity<>(httpStaus);
		// If you want to send a response body, do it like this:
		// List<Products> prod = service.urServiceLayerMethod(id);
		// ResponseEntity<CommonResponseBean> respEntity = new ResponseEntity<>(prod, httpStaus);
		return respEntity;
	}
	
	@PutMapping(value = "/product", produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> updateProduct(@RequestBody ItemInfo itemInfo) {
		HttpStatus httpStaus = HttpStatus.OK;
		ResponseEntity<CommonResponseBean> respEntity = new ResponseEntity<>(httpStaus);
		// If you want to send a response body, do it like this:
		// CommonResponseBean respBean = service.urServiceLayerMethod(itemInfo);
		// ResponseEntity<CommonResponseBean> respEntity = new ResponseEntity<>(respBean, httpStaus);
		return respEntity;
	}
	
	@DeleteMapping(value = "/product/{id}", produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id) {
		HttpStatus httpStaus = HttpStatus.OK;
		ResponseEntity<CommonResponseBean> respEntity = new ResponseEntity<>(httpStaus);
		// If you want to send a response body, do it like this:
		// List<Products> prod = service.urServiceLayerMethod(id);
		// ResponseEntity<CommonResponseBean> respEntity = new ResponseEntity<>(prod, httpStaus);
		return respEntity;
	}
}
