# Spring Boot - Data Masking 

- @JacksonAnnotationsInside: Meta-annotation (annotations used on other annotations) used for indicating that instead of using target annotation (annotation annotated with this annotation), Jackson should use meta-annotations it has. This can be useful in creating "combo-annotations" by having a container annotation, which needs to be annotated with this annotation as well as all annotations it 'contains'.

- @JsonSerialize: Annotation used for configuring serialization aspects, by attaching to "getter" methods or fields, or to value classes. When annotating value classes, configuration is used for instances of the value class but can be overridden by more specific annotations (ones that attach to methods or fields).

- Check serializer package

#### CURL request
        curl --location --request GET 'localhost:8080/users'