# Lombok: anotaciones, funcionalidad y comparación con código manual

> Nota: Lombok es una librería para Java que genera código repetitivo en compilación/IDE, como getters, setters, builders, `equals/hashCode`, `toString`, constructores y loggers.

---

## `@Getter`
**Funcionalidad:** genera getters para un campo o para todos los campos de una clase.

**Con Lombok**
```java
import lombok.Getter;

@Getter
public class User {
    private String name;
    private int age;
}
```

**Sin Lombok**
```java
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

---

## `@Setter`
**Funcionalidad:** genera setters para un campo o para todos los campos no `final`.

**Con Lombok**
```java
import lombok.Setter;

@Setter
public class User {
    private String name;
    private int age;
}
```

**Sin Lombok**
```java
public class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

---

## `@ToString`
**Funcionalidad:** genera automáticamente el método `toString()`.

**Con Lombok**
```java
import lombok.ToString;

@ToString
public class User {
    private String name;
    private int age;
}
```

**Sin Lombok**
```java
public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User(name=" + name + ", age=" + age + ")";
    }
}
```

---

## `@EqualsAndHashCode`
**Funcionalidad:** genera `equals()` y `hashCode()`.

**Con Lombok**
```java
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class User {
    private String email;
    private String username;
}
```

**Sin Lombok**
```java
import java.util.Objects;

public class User {
    private String email;
    private String username;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;
        return Objects.equals(email, other.email)
            && Objects.equals(username, other.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, username);
    }
}
```

---

## `@NoArgsConstructor`
**Funcionalidad:** genera constructor vacío.

## `@RequiredArgsConstructor`
**Funcionalidad:** genera constructor con campos `final` y `@NonNull`.

## `@AllArgsConstructor`
**Funcionalidad:** genera constructor con todos los campos.

**Con Lombok**
```java
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    @NonNull
    private String name;
    private final int age;
    private String city;
}
```

**Sin Lombok**
```java
public class User {
    private String name;
    private final int age;
    private String city;

    public User() {
        this.age = 0;
    }

    public User(String name, int age) {
        if (name == null) throw new NullPointerException("name is marked non-null but is null");
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
```

---

## `@Data`
**Funcionalidad:** combina `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode` y `@RequiredArgsConstructor`.

**Con Lombok**
```java
import lombok.Data;

@Data
public class User {
    private final String id;
    private String name;
}
```

**Sin Lombok**
```java
import java.util.Objects;

public class User {
    private final String id;
    private String name;

    public User(String id) {
        this.id = id;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "User(id=" + id + ", name=" + name + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;
        return Objects.equals(id, other.id) &&
               Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
```

---

## `@Value`
**Funcionalidad:** crea una clase inmutable con getters, constructor, `equals/hashCode` y `toString`.

**Con Lombok**
```java
import lombok.Value;

@Value
public class User {
    String id;
    String name;
}
```

**Sin Lombok**
```java
import java.util.Objects;

public final class User {
    private final String id;
    private final String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "User(id=" + id + ", name=" + name + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;
        return Objects.equals(id, other.id) &&
               Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
```

---

## `@Builder`
**Funcionalidad:** implementa el patrón Builder.

## `@Builder.Default`
**Funcionalidad:** mantiene un valor por defecto dentro del builder.

## `@Singular`
**Funcionalidad:** permite agregar elementos individuales a una colección del builder.

**Con Lombok**
```java
import lombok.Builder;
import lombok.Singular;
import java.util.List;

@Builder
public class User {
    private String name;

    @Builder.Default
    private String role = "USER";

    @Singular
    private List<String> tags;
}
```

**Sin Lombok**
```java
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String role;
    private List<String> tags;

    private User(Builder builder) {
        this.name = builder.name;
        this.role = builder.role;
        this.tags = builder.tags;
    }

    public static class Builder {
        private String name;
        private String role = "USER";
        private List<String> tags = new ArrayList<>();

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder tag(String tag) {
            this.tags.add(tag);
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
```

---

## `@SuperBuilder`
**Funcionalidad:** builder compatible con herencia.

## `@With`
**Funcionalidad:** genera métodos `withX(...)` para devolver una copia del objeto con un campo cambiado.

**Con Lombok**
```java
import lombok.Value;
import lombok.With;

@Value
public class User {
    @With String name;
    int age;
}
```

**Sin Lombok**
```java
public final class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User withName(String name) {
        return new User(name, this.age);
    }
}
```

---

## `@NonNull`
**Funcionalidad:** valida que un parámetro o campo no sea `null`.

**Con Lombok**
```java
import lombok.NonNull;

public class UserService {
    public void save(@NonNull String name) {
        System.out.println(name);
    }
}
```

**Sin Lombok**
```java
public class UserService {
    public void save(String name) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        System.out.println(name);
    }
}
```

---

## `@SneakyThrows`
**Funcionalidad:** permite lanzar checked exceptions sin declararlas en la firma.

**Con Lombok**
```java
import lombok.SneakyThrows;

public class FileService {
    @SneakyThrows
    public void read() {
        throw new java.io.IOException("error");
    }
}
```

**Sin Lombok**
```java
public class FileService {
    public void read() throws java.io.IOException {
        throw new java.io.IOException("error");
    }
}
```

---

## `@Cleanup`
**Funcionalidad:** cierra recursos automáticamente al final del scope.

**Con Lombok**
```java
import lombok.Cleanup;
import java.io.*;

public class Example {
    public void run() throws Exception {
        @Cleanup InputStream in = new FileInputStream("a.txt");
    }
}
```

**Sin Lombok**
```java
import java.io.*;

public class Example {
    public void run() throws Exception {
        InputStream in = new FileInputStream("a.txt");
        try {
            // usar recurso
        } finally {
            if (in != null) in.close();
        }
    }
}
```

---

## Loggers

### `@Slf4j`
### `@Log`
### `@Log4j`
### `@Log4j2`
### `@CommonsLog`
### `@Flogger`
### `@JBossLog`
### `@CustomLog`

**Funcionalidad:** generan automáticamente el campo `log` según el framework de logging.

**Con Lombok**
```java
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserService {
    public void save() {
        log.info("Saving user");
    }
}
```

**Sin Lombok**
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public void save() {
        log.info("Saving user");
    }
}
```

---

## `@UtilityClass`
**Funcionalidad:** convierte una clase en utilitaria y evita su instanciación.

**Con Lombok**
```java
import lombok.experimental.UtilityClass;

@UtilityClass
public class MathUtils {
    int sum(int a, int b) {
        return a + b;
    }
}
```

**Sin Lombok**
```java
public final class MathUtils {
    private MathUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
```

---

## `@Accessors`
**Funcionalidad:** personaliza getters y setters, por ejemplo con estilo fluido o encadenado.

**Con Lombok**
```java
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true, fluent = true)
public class User {
    private String name;
}
```

**Sin Lombok**
```java
public class User {
    private String name;

    public User name(String name) {
        this.name = name;
        return this;
    }

    public String name() {
        return this.name;
    }
}
```

---

## `@FieldDefaults`
**Funcionalidad:** configura nivel de acceso y `final` por defecto para los campos.

## `@Delegate`
**Funcionalidad:** delega automáticamente métodos de un objeto interno.

## `@ExtensionMethod`
**Funcionalidad:** permite usar métodos estáticos como si fueran de instancia.

## `@Synchronized`
**Funcionalidad:** sincroniza usando un lock privado en vez de `this`.

## `@Locked`
**Funcionalidad:** simplifica el uso de `ReentrantLock`.

## `val`
**Funcionalidad:** inferencia local inmutable de tipos.

## `var`
**Funcionalidad:** inferencia local mutable de tipos.

## `onX`
**Funcionalidad:** agrega anotaciones sobre miembros generados por Lombok.

---

## Resumen rápido

| Anotación | Úsala cuando... |
|---|---|
| `@Getter` / `@Setter` | Quieres reducir boilerplate de acceso |
| `@Data` | Tienes un DTO o POJO mutable |
| `@Value` | Quieres un objeto inmutable |
| `@Builder` | Tienes muchos parámetros o construcción compleja |
| `@With` | Quieres copiar objetos inmutables cambiando un campo |
| `@NoArgsConstructor` / `@AllArgsConstructor` / `@RequiredArgsConstructor` | Quieres constructores automáticos |
| `@NonNull` | Quieres validación básica contra null |
| `@Slf4j` y demás logs | Quieres logger sin declararlo manualmente |
| `@SneakyThrows` | Solo en casos puntuales |
| `@Cleanup` | Quieres cerrar recursos con menos código |
| `@Accessors` | Quieres API fluida o setters encadenados |
| `@SuperBuilder` | Tienes herencia y quieres builders |
| `@UtilityClass` | Tienes clase utilitaria pura |
| `@Delegate` / `@ExtensionMethod` | Casos especiales |

---

## Versión corta para apuntes

- `@Getter` / `@Setter`: getters y setters automáticos.
- `@ToString`: genera `toString()`.
- `@EqualsAndHashCode`: genera `equals()` y `hashCode()`.
- `@NoArgsConstructor`: constructor vacío.
- `@RequiredArgsConstructor`: constructor con `final` y `@NonNull`.
- `@AllArgsConstructor`: constructor con todos los campos.
- `@Data`: combo de getters, setters, `toString`, `equals/hashCode`, constructor requerido.
- `@Value`: versión inmutable de `@Data`.
- `@Builder`: patrón builder.
- `@Builder.Default`: valor por defecto en builder.
- `@Singular`: agrega elementos individuales a colecciones del builder.
- `@With`: copia inmutable con un campo cambiado.
- `@NonNull`: valida `null`.
- `@Cleanup`: cierra recursos automáticamente.
- `@SneakyThrows`: evita declarar checked exceptions.
- `@Slf4j` y similares: genera logger.
- `@Accessors`: getters/setters fluídos o encadenados.
- `@UtilityClass`: clase utilitaria.
- `@SuperBuilder`: builder con herencia.
- `@Delegate`: delega métodos.
- `@ExtensionMethod`: usa estáticos como si fueran métodos de instancia.
- `@Synchronized` / `@Locked`: ayuda con sincronización y locks.
