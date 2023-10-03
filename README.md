# spring-interceptor-example

It work as a layer when you hit your end-point, just like filters
Only difference is filters belongs to Servlet API and Interceptor is of Spring

To create a interceptor: Implements HandlerInterceptor and override preHandle, postHandle and afterCompletion methods

```
public class CheckHttpRequestFilter implements HandlerInterceptor {
```

Once we create the interceptor, it will not gonna work unless we register it. To register interceptor,
create a WebConfig class and implement it with WebMvcConfigurer class, and override addInterceptor method

```
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CheckHttpRequestFilter()).order(1);
        registry.addInterceptor(new TestHandlerInterceptor()).order(0);
    }
}
```

We can add filters like which should run first using ``` order ``` and also we can give pathParttern for which API this interceptor should run using ``` addPathPatterns ```
