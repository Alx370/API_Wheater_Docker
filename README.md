# API_Wheater_Docker

## Descrizione

API_Wheater_Docker è un progetto web sviluppato con Spring Boot che consente di visualizzare le informazioni meteorologiche (temperatura attuale, minima e massima) per diversi comuni italiani. L'applicazione integra un database H2 in memoria per la gestione dei dati dei comuni e si collega all'API Open-Meteo per ottenere i dati meteo in tempo reale. L'interfaccia utente è realizzata con Thymeleaf e Chart.js per la visualizzazione grafica delle temperature.

## Funzionalità principali

- **Visualizzazione elenco comuni:** L'utente può selezionare un comune dalla lista per visualizzare i dati meteo.
- **Recupero dati meteo:** Le temperature vengono recuperate in tempo reale tramite chiamata all'API Open-Meteo.
- **Visualizzazione dettagliata:** Le temperature attuale, minima e massima sono mostrate sia come card che tramite grafico a barre interattivo.
- **Interfaccia web responsive:** Utilizzo di CSS personalizzato e Chart.js per una migliore esperienza utente.
- **Database H2:** I dati dei comuni sono precaricati e gestiti tramite un database H2 in memoria.
- **Containerizzazione:** Il progetto è pronto per essere eseguito in ambiente Docker tramite Dockerfile e Docker Compose.

## Struttura del progetto

- `weather/`  
  - `src/main/java/`: codice sorgente Java (controller, servizi, modelli, repository)
  - `src/main/resources/templates/`: template HTML Thymeleaf
  - `src/main/resources/static/css/`: file di stile CSS
  - `src/main/resources/data.sql`: dati iniziali dei comuni
  - `Dockerfile`: per la creazione dell'immagine Docker
- `docker-compose.yml`: orchestrazione dei container

## Come avviare il progetto

1. **Prerequisiti**
   - Docker installato sul sistema

2. **Avvio tramite Docker Compose**
   - Apri il terminale nella cartella principale del progetto
   - Esegui il comando:
     ```sh
     docker-compose up --build
     ```
   - L'applicazione sarà accessibile all'indirizzo [http://localhost:8080](http://localhost:8080)

## Tecnologie utilizzate

- **Spring Boot**: framework backend per la gestione delle API e della logica applicativa
- **Thymeleaf**: motore di template per la generazione dinamica delle pagine HTML
- **Chart.js**: libreria JavaScript per la visualizzazione dei dati tramite grafici
- **H2 Database**: database relazionale in memoria per la gestione dei dati dei comuni
- **Open-Meteo API**: servizio esterno per il recupero dei dati meteorologici
- **Docker & Docker Compose**: containerizzazione e orchestrazione dei servizi

## Esempio di utilizzo

1. Seleziona un comune dalla lista nella home page.
2. Visualizza le temperature attuale, minima e massima per il comune selezionato.
3. Osserva il grafico a barre che mostra l'andamento delle temperature.
4. Torna alla home per selezionare un altro comune.

## Autore

Alessandro Formicola 
- GitHub [@Alx370](https://github.com/Alx370)

## Licenza

Questo progetto è distribuito sotto licenza MIT. Vedi il file [LICENSE](LICENSE) per ulteriori dettagli.
