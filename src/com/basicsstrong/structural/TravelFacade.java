package com.basicsstrong.structural;

class TravelFacade {
	FlightBooking flightBooking;
	TrainBooking trainBooking;
	HotelBooking hotelBooking;

	enum BookingType {
		Flight, Train, Hotel, Flight_And_Hotel, Train_And_Hotel
	};

	public TravelFacade() {
		this.flightBooking = new FlightBooking();
		this.trainBooking = new TrainBooking();
		this.hotelBooking = new HotelBooking();
	}

	public void book(BookingType type, String name) {
		switch(type){
		case Flight:
				// book flight;
				flightBooking.bookFlight(name);
				return;
		case Hotel:
				// book hotel;
				hotelBooking.bookHotel(name);
				return;
		case Train:
				// book flight;
				trainBooking.bookTrain(name);
				return;
		case Flight_And_Hotel:
				// book Flight and Hotel;
				flightBooking.bookFlight(name);
	            hotelBooking.bookHotel(name);
				return;
		case Train_And_Hotel:
				// book Train and Hotel;
				trainBooking.bookTrain(name);
	            hotelBooking.bookHotel(name);
				return;
				
		}
	}
}

 class FlightBooking {

	void bookFlight(String name) {
		System.out.println("Flight booked for " + name);
	}
}

 class TrainBooking {

	void bookTrain(String name) {
		System.out.println("Flight booked for " + name);
	}
}

 class HotelBooking {

	void bookHotel(String name) {
		System.out.println("Flight booked for " + name);
	}
}

