package com.example.demo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BilletRepository;
import com.example.demo.entities.Billet;

@Service
public class BilletMetierImpl implements BilletMetier{

	@Autowired
	private BilletRepository billetRepositoy;
	
	@Override
	public Billet saveBillet(Billet A) {
		
		return billetRepositoy.save(A);
	}

	@Override
	public List<Billet> listBillet() {
		// TODO Auto-generated method stub
		return billetRepositoy.findAll();
	}

}
