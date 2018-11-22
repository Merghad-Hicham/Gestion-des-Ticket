package com.example.demo.metier;

import java.util.List;

import com.example.demo.entities.Billet;


public interface BilletMetier {
    public Billet saveBillet(Billet A);

    public List<Billet> listBillet();
}
