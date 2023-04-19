# Movie API Documentation

This API provides endpoints for retrieving information about movies.


### Movie Base URL
`/api/v1/movies`

### Endpoints

Retrieve all movies `GET /api/v1/movies`

This endpoint retrieves a list of all movies in the system.

```json
[
  {
    "id": {
      "timestamp": 1681901544,
      "date": "2023-04-19T10:52:24.000+00:00"
    },
    "imdbId": "tt10298840",
    "title": "Strange World",
    "releaseDate": "2022-11-23",
    "trailerLink": "https://www.youtube.com/watch?v=bKh2G73gCCs",
    "poster": "https://image.tmdb.org/t/p/w500/kgJ8bX3zDQDM2Idkleis28XSVnu.jpg",
    "genres": [
      "Family",
      "Adventure",
      "Science Fiction",
      "Animation"
    ],
    "backdrops": [
      "https://image.tmdb.org/t/p/original/5wDBVictj4wUYZ31gR5WzCM9dLD.jpg",
      "https://image.tmdb.org/t/p/original/zNIlXd7CAz0hHAInbs2nsFRc0xQ.jpg",
      "https://image.tmdb.org/t/p/original/1rukJHAP5p6DNHe75Oo1D0m3SnR.jpg",
      "https://image.tmdb.org/t/p/original/aKbe411WyjTZy1OZUVIdNDYVf21.jpg",
      "https://image.tmdb.org/t/p/original/9RKvxz0IryD2ofLYyGpnE7HeWlR.jpg",
      "https://image.tmdb.org/t/p/original/kFURsDklj7QGMMkGJVwDBaJJn05.jpg",
      "https://image.tmdb.org/t/p/original/v6oBDkd7ogXzTQxIU0H5SXq0hOL.jpg",
      "https://image.tmdb.org/t/p/original/fBshLiEJcjdfrU3qQBIINcePSsm.jpg",
      "https://image.tmdb.org/t/p/original/3oie0kID8SNCjkqN6Raweg5dJa.jpg",
      "https://image.tmdb.org/t/p/original/zgFldVKON1Nxp8ui7HVABGKDQKM.jpg"
    ],
    "reviewIds": [
      {
        "id": {
          "timestamp": 1681927830,
          "date": "2023-04-19T18:10:30.000+00:00"
        },
        "body": "I loved this movie!"
      }
    ]
  },
  {
    "id": {
      "timestamp": 1681901544,
      "date": "2023-04-19T10:52:24.000+00:00"
    },
    "imdbId": "tt8093700",
    "title": "The Woman King",
    "releaseDate": "2022-09-15",
    "trailerLink": "https://www.youtube.com/watch?v=3RDaPV_rJ1Y",
    "poster": "https://image.tmdb.org/t/p/w500/5O1GLla5vNuegqNxNhKL1OKE1lO.jpg",
    "genres": [
      "Action",
      "Drama",
      "History"
    ],
    "backdrops": [
      "https://image.tmdb.org/t/p/original/gkseI3CUfQtMKX41XD4AxDzhQb7.jpg",
      "https://image.tmdb.org/t/p/original/wSILunFEbvw00Ql2aaMHCSZf3cI.jpg",
      "https://image.tmdb.org/t/p/original/xTsERrOCW15OIYl5aPX7Jbj38wu.jpg",
      "https://image.tmdb.org/t/p/original/j06sSrtbqnZdSgG6yEduao95y48.jpg",
      "https://image.tmdb.org/t/p/original/v4YV4ne1nwNni35iz4WmpZRZpCD.jpg",
      "https://image.tmdb.org/t/p/original/6n5ln1vWGD3JyT6Ibt7ZxjSxY3v.jpg",
      "https://image.tmdb.org/t/p/original/gi47WUUYVQWaLE5mJraS87ycdy6.jpg",
      "https://image.tmdb.org/t/p/original/dTQOU5a32K3UPTIXHgipEqN41OM.jpg",
      "https://image.tmdb.org/t/p/original/7zQJYV02yehWrQN6NjKsBorqUUS.jpg",
      "https://image.tmdb.org/t/p/original/rdDL4y7BxGyXFEDJgAG4lz89bG2.jpg"
    ],
    "reviewIds": []
  }
]

```
Returns a 200 OK status code on success.

### Retrieve a single movie by IMDB ID
`GET /api/v1/movies/{imdbId}`

This endpoint retrieves a single movie with the specified IMDB ID.

### Parameters

| Parameter | Type   | Description                          | 
|-----------|--------|--------------------------------------|
| imdbId    | string | The IMDB ID of the movie to retrieve |

### Response
```json
{
  "id": {
    "timestamp": 1681901544,
    "date": "2023-04-19T10:52:24.000+00:00"
  },
  "imdbId": "tt10298840",
  "title": "Strange World",
  "releaseDate": "2022-11-23",
  "trailerLink": "https://www.youtube.com/watch?v=bKh2G73gCCs",
  "poster": "https://image.tmdb.org/t/p/w500/kgJ8bX3zDQDM2Idkleis28XSVnu.jpg",
  "genres": [
    "Family",
    "Adventure",
    "Science Fiction",
    "Animation"
  ],
  "backdrops": [
    "https://image.tmdb.org/t/p/original/5wDBVictj4wUYZ31gR5WzCM9dLD.jpg",
    "https://image.tmdb.org/t/p/original/zNIlXd7CAz0hHAInbs2nsFRc0xQ.jpg",
    "https://image.tmdb.org/t/p/original/1rukJHAP5p6DNHe75Oo1D0m3SnR.jpg",
    "https://image.tmdb.org/t/p/original/aKbe411WyjTZy1OZUVIdNDYVf21.jpg",
    "https://image.tmdb.org/t/p/original/9RKvxz0IryD2ofLYyGpnE7HeWlR.jpg",
    "https://image.tmdb.org/t/p/original/kFURsDklj7QGMMkGJVwDBaJJn05.jpg",
    "https://image.tmdb.org/t/p/original/v6oBDkd7ogXzTQxIU0H5SXq0hOL.jpg",
    "https://image.tmdb.org/t/p/original/fBshLiEJcjdfrU3qQBIINcePSsm.jpg",
    "https://image.tmdb.org/t/p/original/3oie0kID8SNCjkqN6Raweg5dJa.jpg",
    "https://image.tmdb.org/t/p/original/zgFldVKON1Nxp8ui7HVABGKDQKM.jpg"
  ],
  "reviewIds": [
    {
      "id": {
        "timestamp": 1681927830,
        "date": "2023-04-19T18:10:30.000+00:00"
      },
      "body": "I loved this movie!"
    }
  ]
}
```
Returns a 200 OK status code on success.

### Review Base URL

`/api/v1/reviews`

### Endpoints

### Create Review
Create a new review for a movie with the given IMDB ID.

`POST /api/v1/reviews/create`

### Request Body

| Field      | Type   | Required | Description                              |
|------------|--------|----------|------------------------------------------|
| reviewBody | string | Yes      | The text of the review.                  |
| imdbId     | string | Yes      | The IMDB ID of the movie being reviewed. |

### Request Format

```json
{
  "reviewBody": "<review>",
  "imdbId": "<imdbId of any movie>"
}
```

### Response

```json
{
    "id": {
        "timestamp": 1681930281,
        "date": "2023-04-19T18:51:21.000+00:00"
    },
    "body": "I loved this movie!"
}
```
Returns a 201 CREATED status code on success.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.5/gradle-plugin/reference/html/#build-image)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#data.nosql.mongodb)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)