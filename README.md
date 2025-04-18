<div align="center">
  <img src="upLogo.png" width="150"/>
</div>

<h1 align="center">Enkriptimi dhe Dekriptimi i Tekstit (Caesar Cipher)</h1>


## 📄 Përshkrimi

Ky projekt demonstron një implementim të thjeshtë të Kodit të Cezarit për enkriptimin dhe dekriptimin e teksteve në gjuhën Java, duke përdorur qasje të ndarë në klasa. Mundeson:

- **Enkriptimin** e tekstit duke përdorur algoritmin Caesar Cipher,
- **Dekriptimin** me një vlerë të caktuar `shift`,
- **Brute-force decrypt**, për të zbuluar mesazhin origjinal pa e ditur shift-in,
- Si dhe **testimin automatik** me raste të gatshme pa nevojë për input nga përdoresi.

---

## 📂 Struktura e Projektit

Struktura e projektit është e organizuar si më poshtë:

- **/src/**: përmban files kryesorë të aplikacionit.
 - `Dekriptimi.java`
 - `Enkriptimi.java` 
  - `Main.java`
  - `Testimi.java`


---

## ⚙️ Funksionalitetet

🔹 **Enkriptimi i Tekstit**  
🔹 **Dekriptimi i Tekstit**  
🔹 **Brute-force decrypt**  
🔹 **Testim pa input nga përdoresi**  
🔹 Verifikim për vlefshmërinë e vlerës së `shift` (0–25)  
🔹 Mbështetje për shkronja të vogla dhe të mëdha

---

## 🛠️ Përmbajtja e Klasave

### `Main.java`
Klasa kryesore që ofron një ndërfaqe të thjeshtë përdoruesi për:
- Enkriptimin e tekstit
- Dekriptimin e tekstit
- Modalitetin Brute-Force për dekriptim

### `Enkriptimi.java`
Implementon metodat për:
- Konvertimin e tekstit në formë të enkriptuar
- Përdor algoritme të ndryshme kriptimi
- Gjenerimin e çelësave të nevojshëm

### `Dekriptimi.java`
Përmban funksionalitete për:
- Dekriptimin e tekstit të koduar
- Implementimin e brute-force attack
- Verifikimin e çelësave të vlefshëm

### `Testimi.java`
Klasa e testimeve automatike që:
- Teston të gjitha funksionalitetet bazë
- Kontrollon edge cases
- Nuk kërkon input nga përdoruesi


## Instalimi

### 1. Klononi:
```bash
git clone https://github.com/ErblinSylaFiek/Siguria_Te_Dhenave
```

## Punuan
- Erblin Syla
- Erëza Greiçevci
- Era Berisha
- Erik Behrami

## 📜 Licensa
Ky projekt është nën licensën [MIT](LICENSE).
