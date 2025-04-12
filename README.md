# Leaderboard Microservice Application

This is a REST-based web application designed to return a list of teams sorted by their ranks in ascending order. The application is developed using **Spring Boot** and is built to operate in a **microservices architecture**.

Ideal for building a leaderboard system, this service supports **standalone execution**, is ready for **cloud deployment**, and can seamlessly run behind a **load balancer**, offering robust scalability and performance in distributed environments.

---

## Leaderboard API

**Endpoint:**  
`GET http://localhost:8080/api/v1/leaderboard`

This endpoint provides a JSON-formatted response of all participating teams ordered by rank. It's particularly useful for frontend clients to display a real-time leaderboard UI.

---

## Additional API Endpoints

You can also manage teams and players through the following APIs:

- **Team API:**  
  `POST /api/v1/team` – Add a new team  
  `GET /api/v1/team` – Fetch all existing teams

- **Player API:**  
  `POST /api/v1/player` – Add a new player  
  `GET /api/v1/player` – Get all registered players

- **Health Check:**  
  `GET http://localhost:8080/actuator/health` – Verify if the application is running

---

### Example Response from `/api/v1/leaderboard`

```json
[
  {
    "teamId": 2,
    "teamName": "team2",
    "userId": 2505,
    "matchId": 251,
    "captainId": 689,
    "vcaptainId": 754,
    "totalScore": 5.0,
    "rank": 1
  },
  {
    "teamId": 3,
    "teamName": "team3",
    "userId": 73505,
    "matchId": 2750,
    "captainId": 689,
    "vcaptainId": 854,
    "totalScore": 3.0,
    "rank": 2
  },
  {
    "teamId": 1,
    "teamName": "team1",
    "userId": 353505,
    "matchId": 2750,
    "captainId": 919,
    "vcaptainId": 734,
    "totalScore": 3.0,
    "rank": 2
  },
  {
    "teamId": 4,
    "teamName": "team4",
    "userId": 563505,
    "matchId": 22350,
    "captainId": 9489,
    "vcaptainId": 76754,
    "totalScore": 2.0,
    "rank": 3
  }
]
