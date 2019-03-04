package io.moebius.Recetas.bootstrap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.moebius.Recetas.enums.Dificultad;
import io.moebius.Recetas.modelos.Categoria;
import io.moebius.Recetas.modelos.Ingrediente;
import io.moebius.Recetas.modelos.Nota;
import io.moebius.Recetas.modelos.Receta;
import io.moebius.Recetas.modelos.UnidadMedicion;
import io.moebius.Recetas.servicios.CategoriaServicio;
import io.moebius.Recetas.servicios.RecetaServicio;
import io.moebius.Recetas.servicios.UnidadMedicionServicio;

public class RecetaBootstrap {

	private RecetaServicio recetaServicio;
	private UnidadMedicionServicio unidadMedicionServicio;
	private CategoriaServicio categoriaServicio;

	public RecetaBootstrap(RecetaServicio recetaServicio, UnidadMedicionServicio unidadMedicionServicio,
			CategoriaServicio categoriaServicio) {
		this.recetaServicio = recetaServicio;
		this.unidadMedicionServicio = unidadMedicionServicio;
		this.categoriaServicio = categoriaServicio;
	}

	// Cargado de datos
	private List<Receta> cargarRecetas() {
		List<Receta> recetas = new ArrayList<>();

		// Cargar unidades medición;
		Optional<UnidadMedicion> grOpcional = unidadMedicionServicio.obtenerUnidad("gr");
		if (!grOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> mlOpcional = unidadMedicionServicio.obtenerUnidad("ml");
		if (!mlOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> pizcaOpcional = unidadMedicionServicio.obtenerUnidad("pizca");
		if (!pizcaOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> alGustoOpcional = unidadMedicionServicio.obtenerUnidad("al gusto");
		if (!alGustoOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> sobreOpcional = unidadMedicionServicio.obtenerUnidad("sobre");
		if (!sobreOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> cucharadaOpcional = unidadMedicionServicio.obtenerUnidad("cucharada");
		if (!cucharadaOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> cucharadaSoperaOpcional = unidadMedicionServicio.obtenerUnidad("cucharada sopera");
		if (!cucharadaSoperaOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> cucharaditaOpcional = unidadMedicionServicio.obtenerUnidad("cucharadita");
		if (!cucharaditaOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> trocitoOpcional = unidadMedicionServicio.obtenerUnidad("trocito");
		if (!trocitoOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> punadoOpcional = unidadMedicionServicio.obtenerUnidad("puñado");
		if (!punadoOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		Optional<UnidadMedicion> unidadOpcional = unidadMedicionServicio.obtenerUnidad("unidad");
		if (!unidadOpcional.isPresent()) {
			throw new RuntimeException("Unidad de medición no encontrada.");
		}

		// Volcar unidades medición
		UnidadMedicion gr = grOpcional.get();
		UnidadMedicion ml = mlOpcional.get();
		UnidadMedicion pizca = pizcaOpcional.get();
		UnidadMedicion alGusto = alGustoOpcional.get();
		UnidadMedicion sobre = sobreOpcional.get();
		UnidadMedicion cucharada = cucharadaOpcional.get();
		UnidadMedicion cucharadaSopera = cucharadaSoperaOpcional.get();
		UnidadMedicion cucharadita = cucharaditaOpcional.get();
		UnidadMedicion trocito = trocitoOpcional.get();
		UnidadMedicion punado = punadoOpcional.get();
		UnidadMedicion unidad = unidadOpcional.get();

		// Cargar categorías
		Optional<Categoria> asiaticaOpcional = categoriaServicio.obtenerCategoria("Asiática");
		if (!asiaticaOpcional.isPresent()) {
			throw new RuntimeException("Categoría no encontrada.");
		}

		Optional<Categoria> mexicanaOpcional = categoriaServicio.obtenerCategoria("Mexicana");
		if (!mexicanaOpcional.isPresent()) {
			throw new RuntimeException("Categoría no encontrada.");
		}

		Optional<Categoria> italianaOpcional = categoriaServicio.obtenerCategoria("Italiana");
		if (!italianaOpcional.isPresent()) {
			throw new RuntimeException("Categoría no encontrada.");
		}

		Optional<Categoria> orientalOpcional = categoriaServicio.obtenerCategoria("Oriental");
		if (!orientalOpcional.isPresent()) {
			throw new RuntimeException("Categoría no encontrada.");
		}

		Optional<Categoria> ensaladasOpcional = categoriaServicio.obtenerCategoria("ensaladas");
		if (!ensaladasOpcional.isPresent()) {
			throw new RuntimeException("Categoría no encontrada.");
		}

		Optional<Categoria> pizzasOriental = categoriaServicio.obtenerCategoria("Pizzas");
		if (!pizzasOriental.isPresent()) {
			throw new RuntimeException("Categoría no encontrada.");
		}

		// Volcar categorías
		Categoria asiatica = asiaticaOpcional.get();
		Categoria mexicana = mexicanaOpcional.get();
		Categoria italiana = italianaOpcional.get();
		Categoria oriental = orientalOpcional.get();
		Categoria ensaladas = ensaladasOpcional.get();
		Categoria pizzas = pizzasOriental.get();

		//
		// Recetas
		//

		// Guacamole
		Receta guacamole = new Receta();
		guacamole.setNombre("Guacamole");
		guacamole.setDescripción("Rica salsa espesa y suave de aguacate para acompañar. Vegano y picante.");
		guacamole.setTiempoPreparacion(20);
		guacamole.setTiempoCocina(10);
		guacamole.setDificultad(Dificultad.FACIL);

		String instruccionesGuacamole = "1.- Abrimos el aguacate por la mitad, le quitamos el hueso y cogemos toda la carne que podamos con una cuchara.\n"
				+ "2.- Machacamos la carne del aguacate en un molcajete (o mortero) hasta que tenga la consistencia deseada.\n"
				+ "3.- Incorporamos la cebolla picada, el jalapeño, el cilantro y el tomate, y continuamos mezclándolo bien.\n"
				+ "4.- Agregamos el jugo de lima y sal al gusto, y volvemos a mezclarlo.";

		guacamole.setInstrucciones(instruccionesGuacamole);

		Nota notaGuacamole = new Nota();
		notaGuacamole.setNotasReceta(
				"Para que el guacamole salga perfecto, hay que utilizar aguacates maduros, nunca verdes. La mayoría de las tiendas y supermercados venden aguacates muy poco maduros. Por eso, compra tus aguacates con anticipación, para que puedan madurar unos días en casa.\r\n"
						+ "\r\n"
						+ "Podemos saber que han llegado al punto de madurez óptima cuando al tocarlos no están duros, ni muy blandos. El color también es una pista, cuanto más oscuro, más maduro. Y si le quitas el rabillo, la piel que queda debe ser de color amarillo, ni verde ni marrón.\r\n"
						+ "\r\n"
						+ "Además, nunca hay que mezclar aguacates con diferentes niveles de madurez. Sus diferentes texturas no se combinan, y queda duros trozos de aguacate verde flotando en una mezcla de aguacate suave. ");

		guacamole.setNota(notaGuacamole);

		guacamole.getIngredientes().add(new Ingrediente("aguacates", "maduros", new BigDecimal(2), unidad));
		guacamole.getIngredientes().add(new Ingrediente("cebolla", "picada finamente", new BigDecimal(0.25), unidad));
		guacamole.getIngredientes().add(new Ingrediente("jalapeño", "picado finamente", new BigDecimal(1), unidad));
		guacamole.getIngredientes().add(new Ingrediente("cilantro", "fresco picado", new BigDecimal(1), punado));
		guacamole.getIngredientes()
				.add(new Ingrediente("Zumo de lima", "exprimido natural", new BigDecimal(1), alGusto));
		guacamole.getIngredientes().add(new Ingrediente("sal", "fina", new BigDecimal(1), alGusto));
		guacamole.getIngredientes().add(new Ingrediente("tomate", "finamente picado", new BigDecimal(0.5), unidad));

		recetas.add(guacamole);

		// Falafel easy
		Receta falafel = new Receta();
		falafel.setNombre("Falafel");
		falafel.setDescripción("Receta de falafel fácil. Vegana y sabrosa.");
		falafel.setTiempoPreparacion(30);
		falafel.setTiempoCocina(30);
		falafel.setDificultad(Dificultad.MEDIA);

		String instruccionesFalafel = "Usé todas las especias de las de tarritos, aunque lo que tengáis fresco, seguro que le da mucho mejor sabor.\r\n"
				+ "\r\n"
				+ "El proceso que yo sigo es bastante sencillo, pelo la cebolla y la meto a la picadora para que quede bien fina. Después escurro los garbanzos y los aclaro un poco con agua en colador grande o el escurridor de la pasta. Voy picando en dos o tres tandas los garbanzos también en la picadora y luego los mezclo en un bol con la cebolla. Si no tenéis picadora, cortad la cebolla finita y machacad los garbanzos con un tenedor. Luego añadís harina, la pasta tiene que quedar bastante seca, que no se os pegue a las manos.\r\n"
				+ "\r\n"
				+ "Después solo es cuestión de ir añadiendo las especias, me gustaría especificar, pero al final es cuestión de gustos y que cada uno encuentre las cantidades que más le gustan. Yo suelo echar bastante ajo y me gusta también con bastante comino. Podéis echar en un principio un poquito de todo y cuando lo tengáis bien mezclado probarlo e ir añadiendo al gusto.\r\n"
				+ "\r\n"
				+ "Por último añado el medio sobre de levadura y dejo reposar media hora o así, para que la masa quede más seca.\r\n"
				+ "\r\n"
				+ "Después se hacen bolitas como si fueran croquetas, solo que más aplastaditas (o no, al gusto también). Yo las paso por un poco de pan rallado para que queden bien doradas al freír. Luego a la sartén con abundante aceite caliente  hasta que doren y a escurrir con papel de cocina.\r\n"
				+ "\r\n"
				+ "Si echáis la primera bolita a la sartén y veis que se deshace, seguramente es que la masa está poco compacta, volved a añadir más harina. Yo creo que pierde sabor, pero así no perdéis todo el trabajo…\r\n"
				+ "\r\n" + "Ah! y no hay problema en prepararlo y luego meterlo al congelador antes de freír.\r\n"
				+ "\r\n"
				+ "Lo podéis acompañar con ensalada o en pan de pita como en los Kebaps, sea como sea…¡Que aproveche!";

		falafel.setInstrucciones(instruccionesFalafel);

		Nota notaFalafel = new Nota();
		notaFalafel.setNotasReceta("También se puede hacer al horno.");

		falafel.setNota(notaFalafel);

		falafel.getIngredientes().add(new Ingrediente("Garbanzos", "precocidos", new BigDecimal(400), gr));
		falafel.getIngredientes().add(new Ingrediente("Cebolla", "fresca, picada", new BigDecimal(1), unidad));
		falafel.getIngredientes().add(new Ingrediente("Harina", "de trigo o garbanzo", new BigDecimal(4), cucharada));
		falafel.getIngredientes().add(new Ingrediente("Levadura", "en polvo", new BigDecimal(0.5), sobre));
		falafel.getIngredientes().add(new Ingrediente("Ajo", "en polvo", new BigDecimal(1), alGusto));
		falafel.getIngredientes().add(new Ingrediente("Perejil", "picado", new BigDecimal(1), alGusto));
		falafel.getIngredientes().add(new Ingrediente("Cilantro", "picado", new BigDecimal(1), alGusto));
		falafel.getIngredientes().add(new Ingrediente("Comino", "picado", new BigDecimal(1), alGusto));
		falafel.getIngredientes().add(new Ingrediente("Cúrcuma", "molido", new BigDecimal(1), alGusto));
		falafel.getIngredientes().add(new Ingrediente("Pimienta", "molida", new BigDecimal(1), alGusto));
		falafel.getIngredientes().add(new Ingrediente("Curry", "molido", new BigDecimal(1), alGusto));
		falafel.getIngredientes().add(new Ingrediente("Pan", "rallado", new BigDecimal(1), alGusto));

		recetas.add(falafel);

		return recetas;
	}

}
