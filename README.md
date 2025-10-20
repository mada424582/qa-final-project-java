# qa-final-project-java
[![CI Pipeline](https://github.com/mada424582/qa-final-project-java/actions/workflows/ci.yml/badge.svg)](https://github.com/mada424582/qa-final-project-java/actions/workflows/ci.yml)

Acest proiect este pt testarea unui endpoint cu titlu intr-un docker image folosing tehnologiile: Java, Maven, RestAssured, Docker, Git,
Github.
Dupa ce au fost instalate Java 17+ si APACHE mAVEN, TESTELE se ruleaza in cmd: mvn test.

Pt a rula local, se creaza imaginea docker: docker build -t qa-final-project 
si se ruleaza testele intr-un container cu: docker run qa-final-project