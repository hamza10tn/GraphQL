package graaphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entite.Logement;
import entite.RendezVous;
import repository.LogementRepository;
import repository.RendezVousRepository;

//ajout+update+del
public class MutationAPI implements GraphQLRootResolver {

    public LogementRepository logR;
    public RendezVousRepository rdvR;

    public MutationAPI() {
    }

    public MutationAPI(RendezVousRepository rdvR, LogementRepository logR) {
        this.logR = logR;
        this.rdvR = rdvR;
    }

    public RendezVous createRendezVous(int id, String date, String heure, int refLog, String num) {
        Logement logement=logR.getLogementsByReference(refLog);
        RendezVous rendezVous = new RendezVous(id,date,heure,logement,num);

        rdvR.addRendezVous(rendezVous);

        return rendezVous;

    }
}
