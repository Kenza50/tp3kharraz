package ma.emsi.kharraz.tp3kharraz.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import ma.emsi.kharraz.tp3kharraz.llm.GuideTouristique;

@Path("/guide")
public class GuideTouristiqueResource {

    @Inject
    private GuideTouristique guide;

    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String villeOuPays(@PathParam("ville_ou_pays") String ville_ou_pays) {
        return guide.villeOuPays(ville_ou_pays);
    }
}
