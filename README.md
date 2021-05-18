# SurferAPI
This is a Surfer API readme file.The API allow users (surfers) to post, read, update and delete post information about different surf beaches around the world. This is to inform other users the conditions on those beaches in term of waves height, water temperature, shark attacks etc.
## Motivation
This is a school project and the purpose is to learn spring framework.Postman is used for testing functionality.

### Technical information
**Built with** [Intellij](https://www.jetbrains.com/idea/),
 [POSTMAN](https://grupp3.postman.co/workspace/Scool-Project~eebc92df-6089-4b71-a890-dbef1dc73151/overview)
, [Spring Framework](https://spring.io/projects/spring-framework)


**Documentation** 
 Swagger for API documentation.
[Swagger](https://swagger.io/docs/open-source-tools/swagger-ui/usage/configuration/)

#### Code samples
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

  @Before (value = "execution(* com.grupparbete.Controllers.*.*(..))")
  public void beforeAdvice (JoinPoint joinPoint){
      logger.info("Incoming request to:"+
              joinPoint.getSignature().getDeclaringTypeName() +" -" +
              joinPoint.getSignature().getName()
              );
  }

}


##### ScreenShots/Image

[Image 2](https://drive.google.com/file/d/1g32kTb_Vh1_Gn0TzAC96RjOK3fCWSDwf/view?usp=sharing)

