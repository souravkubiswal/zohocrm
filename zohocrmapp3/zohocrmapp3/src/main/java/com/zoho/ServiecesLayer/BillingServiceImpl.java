package com.zoho.ServiecesLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.Entities.Billing;
import com.zoho.Repositries.BillingRepoSitory;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepoSitory billingrepo;
	
	@Override
	public void generateInvoice(Billing billing) {
		billingrepo.save(billing);
	}

}
