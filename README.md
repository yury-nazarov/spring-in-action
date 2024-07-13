# Конспект: Микросервисы Spring в действии


[https://start.spring.io/]() - консруктор для содания каркаса проекта


Цитаты
- Инкапсуляция – один из основных принципов
  объектно-ориентированного программирования. Чтобы до-
  биться инкапсуляции в Java, переменные класса нужно объявить
  приватными, а затем реализовать общедоступные методы для
  чтения и изменения значений этих переменных.
- POJO (Plain Old Java Object – старый
  добрый Java-объект)
- Lombok – это небольшая библиотека, которая позволяет уменьшить объем
  стандартного кода в классах Java. Lombok автоматически генерирует код,
  например для методов доступа к приватным полям, конструкторов и т. д.

URL
- Get Licence - http://127.0.0.1:8080/v1/organization/OptimaGrown/license/123
- Actuator - http://127.0.0.1:8080/actuator

Аннотации
- @Autowired
- @PathVariable - `@PathVariable("organizationId") String organizationId` - берет значение `{organizationId}`  из path и сохраняет в переменную
- @RequestBody - `@RequestBody License request` - отображает request в объект License
- HTTP аннотации
  - @RequestMapping(value = "v1/organization/{organizationId}/license")
    - Get
      - `@GetMapping(value = "/{licenseId}")`
      - `@RequestMapping(value="/{licenseId}", method=RequestMethod.GET)`
    - Put
      - `@PutMapping`
      - `@RequestMapping(method=RequestMethod.PUT)`
    - Post
      - `@PostMapping`
      - `@RequestMapping(method = RequestMethod.POST)`
    - Delete
      - `@DeleteMapping(value = "/{licenseId}")`
      - `@RequestMapping(value="/{licenseId}",method = RequestMethod.DELETE)`
    