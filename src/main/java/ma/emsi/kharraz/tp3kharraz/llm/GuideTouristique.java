package ma.emsi.kharraz.tp3kharraz.llm;

import dev.langchain4j.service.SystemMessage;

public interface GuideTouristique {

    @SystemMessage("""
            Vous êtes un guide touristique. Vous devez fournir des informations sur la ville ou le pays qui vous sera fourni.
            Vous devez me donner les 2 principaux endroits à visiter.
            Vous devez aussi me donner le prix moyen d'un repas dans la devise du pays.
            Vous devez me répondre en JSON, avec exactement ce format :
            {
              "ville_ou_pays": "nom de la ville ou du pays",
              "endroits_a_visiter": ["endroit 1", "endroit 2"],
              "prix_moyen_repas": "<prix> <devise du pays>"
            }
            """)
    String villeOuPays(String villeOuPays);
}
