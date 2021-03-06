package com.mcds5510.service;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mcds5510.connect.ConnectionSingleton;
import com.mcds5510.dao.MySqlAccess;
import com.mcds5510.entity.Transaction;

public class TrxnWebService {

	MySqlAccess dao=new MySqlAccess();
	ConnectionSingleton myCon=ConnectionSingleton.getObject();
	Connection connection=myCon.getConnection();

	public void getSingleTrxn(String id) { 
		dao.getSingleTrxn(id, connection);
	}

	public void createTrxns(Transaction trxn) {
		dao.createTrxns(trxn, connection);
	}

	public void updateTrxns(Transaction trxn) {
		dao.updateTrxns(trxn, connection);
	}

	public void removeTrxns(String id) {
		dao.removeTrxns(id, connection);
	}

	public Transaction resetTrxn(Transaction trxn) {
		return dao.resetTrxn(trxn);
	}

	public void test() {
		dao.test();
		System.out.println("test");
	}

}

