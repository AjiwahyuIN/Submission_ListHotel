package com.aji.submission;

import java.util.ArrayList;

public class HotelData {
    private static String[] hotelName = {
            "Grand Tjokro",
            "CitraDream Hotel",
            "Marriot Hotel",
            "Dafam Hotel",
            "Grand Keisha Hotel",
            "The Sunrise Hotel",
            "Allstay Hotel",
            "Grand Mecure Hotel",
            "The Victoria Hotel",
            "Phoenix Hotel"
    };

    private static String[] hotelStar = {
            "4-Star Hotel",
            "3-Star Hotel",
            "5-Star Hotel",
            "3-Star Hotel",
            "3-Star Hotel",
            "1-Star Hotel",
            "4-Star Hotel",
            "5-Star Hotel",
            "5-Star Hotel",
            "5-Star Hotel"
    };

    private static String[] hotelDesc = {
            "In a modern glass-fronted building along a bustling road, this polished hotel is 6 km from the Jalan Malioboro shopping area, 8 km from the Kraton Ngayogyakarta Hadiningrat palace and 9 km from Taman Sari, once part of a royal garden.\n" +
                    "\n" +
                    "The laid-back rooms feature free Wi-Fi, flat-screen TVs and safes, plus tea and coffeemakers. Suites have glass-walled bathrooms in view of the room. Room service is available 24/7.\n" +
                    "\n" +
                    "Amenities include a casual restaurant and an airy lounge with floor-to-ceiling windows. There's also an outdoor pool, a spa and a gym, plus a ballroom and 11 meeting spaces.",
            "This laid-back hotel in a colorful building is 2 km from the lively Jalan Malioboro shopping district, and 4 km from Keraton Ngayogyakarta Hadiningrat, an 18th-century royal palace.\n" +
                    "\n" +
                    "Simply furnished rooms come with complimentary Wi-Fi, flat-screen TVs and safes.\n" +
                    "\n" +
                    "Complimentary perks include parking, and hot breakfast served in a vibrant dining room. Meeting space is available.",
            "In a modern building lined with palm trees, this elegant hotel is 7 km from the Jogja Expo Center and 8 km from Yogyakarta Adisucipto International Airport.\n" +
                    "\n" +
                    "Stylish rooms with city or pool views include free Wi-Fi, flat-screens and minifridges, as well as tea and coffeemakers, and marble bathrooms; some offer sofabeds. Upgraded rooms provide access to a lounge serving breakfast and snacks. Suites add separate living rooms. Room service is available 24/7.\n" +
                    "\n" +
                    "Parking is complimentary. There are 3 restaurants; 1 offers Mediterranean cuisine and outdoor seating. Other amenities include an indoor/outdoor pool, along with a a spa and a fitness center.",
            "This stylish hotel in a colorful building is a 6-minute walk from high-end shopping at Jalan Malioboro, and 3 km each from the 18th-century Palace of Yogyakarta and the royal gardens at Taman Sari.\n" +
                    "\n" +
                    "Bright, informal rooms offer free Wi-Fi, flat-screen TVs and coffeemakers. A top-floor suite features a separate living area and direct pool access.\n" +
                    "\n" +
                    "There's a chic restaurant and a spa, as well as a rooftop terrace with a pool and a bar.",
            "Set in a commercial area, this relaxed hotel is 5 km from Jogja Bay, 6 km from the Monument Yogya Kembali and 4 km from the Affandi Museum.\n" +
                    "\n" +
                    "Stylish rooms feature free Wi-Fi and flat-screen TVs, plus minibars, and tea and coffeemaking facilities. They also have bathrooms with rainfall showers; suites add living areas. Room service is available.\n" +
                    "\n" +
                    "There's an elegant restaurant serving regional cuisine, plus 2 lounges, including a warm 9th-floor lounge with city views. Additional amenities include an outdoor pool, a gym and a ballroom.",
            "Set on National Route 15, this unassuming budget hotel is 7 km from Jogja Bay Pirates Adventure Waterpark and 8 km from Adisucipto International Airport.\n" +
                    "\n" +
                    "The unpretentious rooms come with Wi-Fi and flat-screen TVs. Family rooms are also available.\n" +
                    "\n" +
                    "There's a lobby lounge, as well as a down-to-earth 24-hour cafe with terrace seating. Parking is offered.",
            "On a street lined with eateries, this contemporary hotel with a hip vibe is 6 km from both Adisucipto International Airport and the Tugu Jogja monument, and 8 km from history exhibits at Museum Benteng Vredeburg.\n" +
                    "\n" +
                    "Streamlined rooms with wood floors and retro-inspired furnishings feature complimentary Internet access and flat-screen TVs, in addition to desks. Upgraded rooms have tea and coffeemakers; suites add either seating areas or separate living rooms with wet bars.\n" +
                    "\n" +
                    "Freebies include airport shuttles and breakfast. There's also a chic restaurant, a casual lobby lounge and a spa.",
            "Set in a commercial area and offering views of the surrounding mountains, this upmarket hotel is 5 km from both Maguwo train station and Jalan Malioboro, a bustling road with shops, street performers and food stalls.\n" +
                    "\n" +
                    "Chic rooms feature free Wi-Fi, flat-screen TVs and minifridges; some come with balconies, mountain views and/or access to a private lounge. Kids age 12 and under (up to 2 per room) stay at no charge with a parent. Room service is available 24/7.\n" +
                    "\n" +
                    "Parking and a shuttle to Jalan Malioboro are free. There's also an airy international restaurant and a cozy cocktail lounge, along with a gym and an outdoor pool.",
            "Set in a colorful, modern building, this informal hotel is 4 km from Adisucipto International Airport, 5 km from the bustling shopping street of Jalan Malioboro, and 7 km from the Palace of Yogyakarta.\n" +
                    "\n" +
                    "Warmly decorated, unassuming rooms offer flat-screens TVs and minibars; some have sitting areas.\n" +
                    "\n" +
                    "Freebies include breakfast and parking. Other amenities include a casual restaurant and a cafe, both with terraces. There's also an airy lobby lounge and an outdoor pool.",
            "Set in a colonial building dating from 1918, this refined hotel is 2.1 km from the shops and restaurants of Jalan Malioboro, and 4 km from the 18th-century palace of Kraton Ngayogyakarta Hadiningrat.\n" +
                    "\n" +
                    "Featuring traditional Indonesian decor, the elegant rooms offer free Wi-Fi and flat-screen TVs. Upgraded rooms add coffeemakers and minibars; suites include separate living rooms. Cribs are available, and room service is offered.\n" +
                    "\n" +
                    "Parking is free. Other facilities include a cosy wine bar, an open-air bar with a fountain, and a genteel, international restaurant with chandeliers. There’s also a spa, a gym, and an outdoor pool in an inner courtyard."
    };

    private static int[] hotelPhoto = {
            R.drawable.grandtjokro,
            R.drawable.citradream,
            R.drawable.marriot,
            R.drawable.dafam,
            R.drawable.grandkeisha,
            R.drawable.sunrisehotel,
            R.drawable.allstayhotel,
            R.drawable.grandmecure,
            R.drawable.thevictoria,
            R.drawable.phoenixhotel
    };

    public static ArrayList<Hotel> getListData() {
        ArrayList<Hotel> list = new ArrayList<>();
        for (int position = 0; position < hotelName.length; position++) {
            Hotel hotel = new Hotel();
            hotel.setNama(hotelName[position]);
            hotel.setDetail(hotelStar[position]);
            hotel.setPhoto(hotelPhoto[position]);
            hotel.setDeskripsi(hotelDesc[position]);
            list.add(hotel);
        }
        return list;
    }
}