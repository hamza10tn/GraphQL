package graaphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entite.Logement;
import entite.RendezVous;
import repository.LogementRepository;
import repository.RendezVousRepository;

import java.util.List;
//affichage
public class QueryAPI implements GraphQLRootResolver {


public LogementRepository logR;
    public RendezVousRepository rdvR;

    public QueryAPI(RendezVousRepository rdvR) {
        this.rdvR = rdvR;
    }
    public QueryAPI(LogementRepository logR) {
        this.logR = logR;
    }

    public QueryAPI(RendezVousRepository rdvR,LogementRepository logR) {
        this.logR = logR;
        this.rdvR = rdvR;
    }

    public List<RendezVous> getAllRdv(){
        return rdvR.getListeRendezVous();
    }
    public List<Logement> getAllLog(){
        return logR.getAllLogements();
    }
    public Logement searchLogId(int ref){
        return logR.getLogementsByReference(ref);

    }









}
