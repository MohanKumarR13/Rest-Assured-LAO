package com.lao.complexJson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub
		SuperHeroMoviesAndTVSeries heroMoviesAndTVSeries = new SuperHeroMoviesAndTVSeries();
		heroMoviesAndTVSeries.setCategory("Super Hero Movies & TVSeries");
		List<String> acceptedFranchises = new ArrayList<String>();
		acceptedFranchises.add("DC");
		acceptedFranchises.add("Marvel");
		heroMoviesAndTVSeries.setAcceptedFranchises(acceptedFranchises);
		List<String> genres = new ArrayList<String>();
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Heroic");
		genres.add("Dark");
		genres.add("Funny");
		heroMoviesAndTVSeries.setGenres(genres);
		List<Movies> allMovies = new ArrayList<Movies>();
		Movies batman = new Movies();
		batman.setTitle("BatMan The Dark Knight");
		batman.setYear(2008);

		List<String> batmanCast = new ArrayList<String>();
		batmanCast.add("Christian Bale");
		batmanCast.add("Heath Ledger");
		batman.setCast(batmanCast);
		allMovies.add(batman);
		Movies jl = new Movies();
		jl.setTitle("Snyder Cut");
		jl.setYear(2021);

		List<String> jlCast = new ArrayList<String>();
		jlCast.add("Henry Cavil");
		jlCast.add("Gal Gadot");
		jl.setCast(jlCast);
		allMovies.add(jl);
		Movies avengersAgeOfUltran = new Movies();
		avengersAgeOfUltran.setTitle("Avengers Age Of Ultran");
		avengersAgeOfUltran.setYear(2015);

		List<String> avengersAgeOfUltranCast = new ArrayList<String>();
		avengersAgeOfUltranCast.add("Robert Downy Jr");
		avengersAgeOfUltranCast.add("Chris Evans");
		avengersAgeOfUltran.setCast(avengersAgeOfUltranCast);
		allMovies.add(avengersAgeOfUltran);
		Movies avengers = new Movies();
		avengers.setTitle("The Avengers");
		avengers.setYear(2012);

		List<String> avengersCast = new ArrayList<String>();
		avengersCast.add("Chris Evans");
		avengersCast.add("Chris Hemsworth");
		avengers.setCast(avengersCast);
		allMovies.add(avengers);
		List<TVSeries> allTvSeries = new ArrayList<TVSeries>();
		TVSeries flash = new TVSeries();
		flash.setTitle("Flash");
		flash.setYear(2014);
		allTvSeries.add(flash);
		TVSeries gotham = new TVSeries();
		gotham.setTitle("Gotham");
		gotham.setYear(2014);
		allTvSeries.add(gotham);
		TVSeries superGirl = new TVSeries();
		superGirl.setTitle("Super Girl");
		superGirl.setYear(2015);
		allTvSeries.add(superGirl);
		OtherDetails otherDetails = new OtherDetails();
		otherDetails.setCountry("USA");
		otherDetails.setLanguage("English");
		heroMoviesAndTVSeries.setMovies(allMovies);
		heroMoviesAndTVSeries.setTvSeries(allTvSeries);
		heroMoviesAndTVSeries.setOtherDetails(otherDetails);
		ObjectMapper mapper = new ObjectMapper();
		File superJson = new File("src/test/resources/complex.json");
		mapper.writerWithDefaultPrettyPrinter().writeValue(superJson, heroMoviesAndTVSeries);
	}

}
