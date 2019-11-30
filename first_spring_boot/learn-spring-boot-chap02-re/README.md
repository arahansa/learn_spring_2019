# 기타
assertJ 를 라이브러리로 사용하여 테스트 문법이 책과 약간 다릅니다. 


# 48 p
Add as Modules to 에서 루트 프로젝트가 안 보인다면 인텔리제이를 재시작해주세요

# 50 p
server.port:80 은 yml 형식에서이고
server.port=80 은 properties 파일에서 적어줘야합니다.

# 55 p 

https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.1-Release-Notes#junit-5
https://reflectoring.io/spring-boot-test/
에 의하면 Spring boot 2.1 버젼부터 SpringBootTest 에서 ExtendWith 를 제공하므로 JUnit5를 사용하면 굳이 적을 필요가 없다고합니다.
 
# 57p
@Data 라는 어노테이션이 있는 프로젝트 최초 설정시 lombok 라이브러리 설치와
인텔리제이에서 lombok 설정이 필요합니다.

여기 사이트에서 Explorer 버튼을 누르시면 gradle 소스가 나옴 (이 깃헙에도 그대로 설정)
- https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.2.1.RELEASE&packaging=jar&jvmVersion=1.8&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,lombok

인텔리제이 설정방법
- https://gmlwjd9405.github.io/2018/11/29/intellij-lombok.html

