
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a>
    <img src="src/main/resources/images/logo.png" alt="Logo" width="120" height="80">
  </a>

<h3 align="center">Weather Forecast</h3>

  <p align="center">
    To provide the weather forecast
    <br />
    <br />
    <br />
  </p>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
## About The Project
***
The service provides weather forecast information.

### Built With

* Spring Boot
* Spring Web
* Java 17


<!-- GETTING STARTED -->
## Getting Started
***
If you clone the repository or download as a zip and run it locally, it will create .war file. After that you can run it on an application server.


<!-- USAGE EXAMPLES -->
## Usage
***
When you call following API with the city name, you will get weather forecast for the next 48 hours with 3-hour step;
* GET : api/weather-forecast/get/next48


<!-- ROADMAP -->
## Roadmap
***

## APIs


### *api/weather-forecast/get/next48


Request;
```
city *required
string
(query)

http://localhost:8080/api/weather-forecast/get/next48?city=Istanbul
```
Response;
```
{
  "cod": "200 OK",
  "dataList": [
    {
      "humidity": 94,
      "temp_max": 18.8,
      "feels_like": 18.32
    },
    {
      "humidity": 90,
      "temp_max": 18.41,
      "feels_like": 18.36
    },
    {
      "humidity": 83,
      "temp_max": 18.65,
      "feels_like": 18.51
    },
    {
      "humidity": 72,
      "temp_max": 19.11,
      "feels_like": 18.96
    },
    {
      "humidity": 62,
      "temp_max": 20.56,
      "feels_like": 20.29
    },
    {
      "humidity": 56,
      "temp_max": 21.91,
      "feels_like": 21.62
    },
    {
      "humidity": 59,
      "temp_max": 20.64,
      "feels_like": 20.3
    },
    {
      "humidity": 64,
      "temp_max": 18.89,
      "feels_like": 18.51
    },
    {
      "humidity": 68,
      "temp_max": 18.2,
      "feels_like": 17.85
    },
    {
      "humidity": 69,
      "temp_max": 17.8,
      "feels_like": 17.44
    },
    {
      "humidity": 69,
      "temp_max": 17.73,
      "feels_like": 17.36
    },
    {
      "humidity": 67,
      "temp_max": 18.22,
      "feels_like": 17.85
    },
    {
      "humidity": 74,
      "temp_max": 17.79,
      "feels_like": 17.56
    },
    {
      "humidity": 65,
      "temp_max": 19.12,
      "feels_like": 18.78
    },
    {
      "humidity": 70,
      "temp_max": 18.11,
      "feels_like": 17.8
    },
    {
      "humidity": 73,
      "temp_max": 18.19,
      "feels_like": 17.97
    }
  ]
}
```


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/turgayserdas
