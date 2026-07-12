package it.unisannio.soscity.soscity_app.util

import it.unisannio.soscity.soscity_app.R

/**
 * Restituisce l'id di destinazione (nav graph) corrispondente alla home del ruolo,
 * o null se il ruolo non è supportato.
 *
 * Punto unico dove vive la lista dei ruoli con una home dedicata.
 *
 * NOTA: "OPERATORE" non è incluso deliberatamente, ha una dashboard web separata
 * e non una home in questa app.
 */
fun roleHomeDestination(ruolo: String): Int? = when (ruolo) {
    "CITTADINO" -> R.id.cittadinoContainerFragment
    "TECNICO" -> R.id.technicianHomeFragment
    else -> null
}