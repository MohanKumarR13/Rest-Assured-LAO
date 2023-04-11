package com.ems.extra_concepts;

public class Tour {
	String place;
	String modeOfTravel;

	public String getPlace() {
		return place;
	}

	public Tour setPlace(String place) {
		this.place = place;
		return this;
	}

	public String getModeOfTravel() {
		return modeOfTravel;
	}

	public Tour setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
		return this;
	}

	public void whereAreYouGoing() {
		System.out.println(getPlace());
		System.out.println("Travel" + getModeOfTravel() + "to" + getPlace());

	}

	public static void main(String[] args) {
		Tour tour = new Tour();
		tour.setPlace("Goa");
		tour.setModeOfTravel("Car");
		tour.whereAreYouGoing();
		tour.setPlace("Goa").setModeOfTravel("Car");

	}

}
