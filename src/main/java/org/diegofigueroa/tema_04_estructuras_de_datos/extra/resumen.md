| Colección / Map | Tipo | Descripción | Mutable | Duplicados | Orden de inserción | Orden natural / por comparador | Indexable | Inserción rápida | Búsqueda rápida | Acceso por clave | Permite `null` | Sincronizada |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| `ArrayList` | List | Lista basada en arreglo dinámico. Muy usada para acceso por índice. | ✅ | ✅ | ✅ | ❌ | ✅ | ✅ | ❌ | ❌ | ✅ | ❌ |
| `LinkedList` | List / Deque | Lista doblemente enlazada. Buena para inserciones/eliminaciones frecuentes en extremos. | ✅ | ✅ | ✅ | ❌ | ✅ | ✅ | ❌ | ❌ | ✅ | ❌ |
| `Vector` | List | Similar a `ArrayList`, pero sincronizada. | ✅ | ✅ | ✅ | ❌ | ✅ | ✅ | ❌ | ❌ | ✅ | ✅ |
| `Stack` | List | Pila LIFO heredada de `Vector`. Hoy suele preferirse `Deque`. | ✅ | ✅ | ✅ | ❌ | ✅ | ✅ | ❌ | ❌ | ✅ | ✅ |
| `HashSet` | Set | Conjunto basado en hash. No mantiene orden. | ✅ | ❌ | ❌ | ❌ | ❌ | ✅ | ✅ | ❌ | ✅ | ❌ |
| `LinkedHashSet` | Set | Conjunto basado en hash que conserva orden de inserción. | ✅ | ❌ | ✅ | ❌ | ❌ | ✅ | ✅ | ❌ | ✅ | ❌ |
| `TreeSet` | NavigableSet | Conjunto ordenado automáticamente. | ✅ | ❌ | ❌ | ✅ | ❌ | ❌ | ✅ | ❌ | ❌ | ❌ |
| `EnumSet` | Set | Set optimizado para valores de un `enum`. | ✅ | ❌ | ❌ | ❌ | ❌ | ✅ | ✅ | ❌ | ❌ | ❌ |
| `PriorityQueue` | Queue | Cola con prioridad; el orden depende de prioridad, no de inserción. | ✅ | ✅ | ❌ | ✅ | ❌ | ✅ | ❌ | ❌ | ❌ | ❌ |
| `ArrayDeque` | Deque | Doble cola muy eficiente para pila y cola. Suele reemplazar `Stack`. | ✅ | ✅ | ✅ | ❌ | ❌ | ✅ | ❌ | ❌ | ❌ | ❌ |
| `HashMap` | Map | Mapa basado en hash. Muy rápido para clave-valor. | ✅ | Claves: ❌ / Valores: ✅ | ❌ | ❌ | ❌ | ✅ | ✅ | ✅ | ✅ | ❌ |
| `LinkedHashMap` | Map | `HashMap` que conserva orden de inserción. | ✅ | Claves: ❌ / Valores: ✅ | ✅ | ❌ | ❌ | ✅ | ✅ | ✅ | ✅ | ❌ |
| `TreeMap` | NavigableMap | Mapa ordenado por clave. | ✅ | Claves: ❌ / Valores: ✅ | ❌ | ✅ | ❌ | ❌ | ✅ | ✅ | ❌ | ❌ |
| `Hashtable` | Map | Versión antigua sincronizada de mapa. Hoy suele preferirse `HashMap`. | ✅ | Claves: ❌ / Valores: ✅ | ❌ | ❌ | ❌ | ✅ | ✅ | ✅ | ❌ | ✅ |
| `WeakHashMap` | Map | Mapa cuyas claves pueden ser liberadas por el GC si no tienen referencias fuertes. | ✅ | Claves: ❌ / Valores: ✅ | ❌ | ❌ | ❌ | ✅ | ❌ | ✅ | ✅ | ❌ |
| `IdentityHashMap` | Map | Compara claves por referencia (`==`) en vez de `equals()`. | ✅ | Claves: ❌ / Valores: ✅ | ❌ | ❌ | ❌ | ✅ | ❌ | ✅ | ✅ | ❌ |
| `ConcurrentHashMap` | Map | Mapa concurrente para acceso seguro en múltiples hilos. | ✅ | Claves: ❌ / Valores: ✅ | ❌ | ❌ | ❌ | ✅ | ✅ | ✅ | ❌ | ✅ |

### Leyenda
- **Mutable**: se puede modificar después de crearla.
- **Duplicados**: permite elementos repetidos. En `Map`, las claves no se duplican.
- **Orden de inserción**: mantiene el orden en que agregaste elementos.
- **Orden natural / por comparador**: mantiene elementos ordenados automáticamente.
- **Indexable**: permite acceso por índice, como `get(i)`.
- **Inserción rápida**: generalmente eficiente para agregar elementos.
- **Búsqueda rápida**: generalmente eficiente para buscar elementos o claves.
- **Acceso por clave**: aplica a `Map`.
- **Permite `null`**: acepta elementos, claves o valores `null`.
- **Sincronizada**: preparada para acceso seguro entre hilos por defecto.

## Cuándo usar cada colección y map en Java

- **`ArrayList` (`List`)**  
  Úsala cuando necesitas una lista general, acceso rápido por índice y muchas lecturas. Es la opción más común para listas.

- **`LinkedList` (`List` / `Deque`)**  
  Úsala cuando harás muchas inserciones o eliminaciones al inicio o en medio de la lista. No es la mejor para acceso por índice frecuente.

- **`Vector` (`List`)**  
  Úsala solo si necesitas una lista sincronizada antigua por compatibilidad con código legado. En proyectos modernos suele preferirse `ArrayList`.

- **`Stack` (`List`)**  
  Úsala para comportamiento tipo pila LIFO, aunque hoy es más recomendable `ArrayDeque` para ese caso.

- **`HashSet` (`Set`)**  
  Úsalo cuando necesitas elementos únicos y no te importa el orden. Muy útil para evitar duplicados rápidamente.

- **`LinkedHashSet` (`Set`)**  
  Úsalo cuando necesitas elementos únicos y además conservar el orden en que fueron insertados.

- **`TreeSet` (`NavigableSet`)**  
  Úsalo cuando necesitas elementos únicos y ordenados automáticamente.

- **`EnumSet` (`Set`)**  
  Úsalo cuando trabajas con valores de un `enum` y quieres máxima eficiencia.

- **`PriorityQueue` (`Queue`)**  
  Úsala cuando necesitas procesar elementos según prioridad y no según orden de llegada.

- **`ArrayDeque` (`Deque`)**  
  Úsala cuando necesitas una cola o una pila eficiente. Es de las mejores opciones para reemplazar `Stack` o implementar colas simples.

- **`HashMap` (`Map`)**  
  Úsalo cuando necesitas guardar pares clave-valor con acceso rápido y no te importa el orden.

- **`LinkedHashMap` (`Map`)**  
  Úsalo cuando necesitas clave-valor y además conservar el orden de inserción.

- **`TreeMap` (`NavigableMap`)**  
  Úsalo cuando necesitas un mapa ordenado por clave.

- **`Hashtable` (`Map`)**  
  Úsalo solo por compatibilidad con código antiguo. En código moderno suele preferirse `HashMap` o `ConcurrentHashMap`.

- **`WeakHashMap` (`Map`)**  
  Úsalo cuando quieres que ciertas claves puedan eliminarse automáticamente por el recolector de basura si ya no tienen referencias fuertes.

- **`IdentityHashMap` (`Map`)**  
  Úsalo cuando necesitas comparar claves por referencia (`==`) y no por `equals()`.

- **`ConcurrentHashMap` (`Map`)**  
  Úsalo cuando varios hilos necesitan acceder y modificar un mapa de forma segura y eficiente al mismo tiempo.