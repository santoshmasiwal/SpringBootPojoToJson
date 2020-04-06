package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {

	@RequestMapping("aliens")
	public List<Alien> getAlien() {
		List<Alien> aliens = new ArrayList<Alien>();

		Alien a1 = new Alien();

		a1.setId(101);
		a1.setName("Navin");
		a1.setPoints(70);

		Alien a2 = new Alien();

		a2.setId(102);
		a2.setName("Priya");
		a2.setPoints(80);

		aliens.add(a1);
		aliens.add(a2);
		return aliens;

	}
	// An endpoint /toss (which maps to method -tossAliens()) which returns Navin's
	// or Priya's objects randomly each time
	// we hit localhost:8080/toss
	// Sample out: {"id":101,"name":"Navin","points":70}
	// Not array, need an object output
/*
	@RequestMapping("toss")
	public Alien tossAliens()
	{
		List<Alien> bothAliens = getBothAliens();
		Random rand = new Random();
		return bothAliens.get(rand.nextInt(bothAliens.size()));
	}

	private List<Alien> getBothAliens() {
		// TODO Auto-generated method stub
		List<Alien> all = new ArrayList<Alien>();
		all.add(new Alien(1, "Navin", 0));
		all.add(new Alien(2, "Mary", 1));
		return all;
	}
	*/
	
	@RequestMapping("toss")
	public Alien tossAlien()
	{
		List<Alien> bothAlien=getBothAlien();
		Random rand=new Random();
		return bothAlien.get(rand.nextInt(bothAlien.size()));
	}
	private List<Alien> getBothAlien() {
		
		List<Alien> al=new ArrayList<>();
		al.add(new Alien(1,"Navin",50));
		al.add(new Alien(2,"Priya",100));
		al.add(new Alien(3,"Varun",150));
	
		return al;
	}

}
