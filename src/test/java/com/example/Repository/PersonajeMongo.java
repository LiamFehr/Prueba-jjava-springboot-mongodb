package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Personaje;
public interface PersonajeMongo extends MongoRepository<Personaje, String>
{

}
