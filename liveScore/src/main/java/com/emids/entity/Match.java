package com.emids.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matches")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String league;
	private String day;

	private String homeTeamPicture;
	private String team1;

	private String awayTeamPicture;
	private String team2;

	private String team1Score;
	private String team2Score;

	private String team1Overs;
	private String team2Overs;

	private String venue;
	private String matchStatus;

	private String matchNo;
	

	
	

}


/*
  {
     "id" : 1,
     "team1" : "india",
     "team2" : "southAfrica",
     "venue" : "india",
     "matchStatus" : "india need 88 Runs to win",
     "team1Score" : "195-4",
     "team2Score" : "107-2",
     "img" : "https://images.indianexpress.com/2019/06/india-vs-south-africa-759.jpg"
  }
 
  {
    "id" : 2,
    "team1" : "England",
    "team2" : "Australia",
    "venue" : "Australia",
    "matchStatus" : "Australia need 228 Runs to win",
    "team1Score" : "408-6",
    "team2Score" : "181-2",
    "img" : "https://i.ytimg.com/vi/ywdWeV7VqfE/maxresdefault.jpg"
}




{
    "id" : 3,
    "team1" : "New Zealand",
    "team2" : "West Indes",
    "venue" : "New Zealand",
    "matchStatus" : "West Indes won by 2 Wickets",
    "team1Score" : "180-6",
    "team2Score" : "181-8",
    "img" : "https://images.indianexpress.com/2019/06/22-june_west-indies-vs-new-zealand_759.jpg"
}
  
 */