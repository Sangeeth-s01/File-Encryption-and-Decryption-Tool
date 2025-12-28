# File Encryption and Decryption Tool

## 📘 Project Overview

The **File Encryption and Decryption Tool** is a Java-based console application developed as a **Data Structures (CSM-228) mini project**.  
The project demonstrates how **Data Structures and Algorithms (DSA)** can be applied to real-world security problems by implementing multiple encryption and decryption techniques in a modular and memory-efficient manner.

The system supports **three encryption algorithms**:
- Caesar Cipher
- XOR Cipher
- AES (Advanced Encryption Standard)

The application allows users to securely encrypt and decrypt files using password-based encryption while efficiently handling large files using stream-based processing.

---

## 🎯 Objectives

- To implement file encryption and decryption using Java
- To apply Data Structures such as arrays, queues, and hash maps
- To support multiple encryption algorithms in a single tool
- To process files efficiently without loading entire files into memory
- To demonstrate modular and object-oriented design

---

## 🔐 Encryption Algorithms Implemented

### 1. Caesar Cipher
- Basic substitution cipher
- Shifts file bytes by a fixed value
- Used for algorithmic demonstration

### 2. XOR Cipher
- Symmetric encryption using bitwise XOR operation
- Same logic for encryption and decryption
- Efficient and fast

### 3. AES (Advanced Encryption Standard)
- Industry-standard symmetric encryption
- Uses password-based key generation
- Implemented using Java Cryptography Architecture (JCA)
- Provides strong real-world security

---

## 🧱 Data Structures Used

- **Arrays** – Byte-level file and key processing
- **Queue (FIFO)** – Chunk-based file encryption and decryption
- **HashMap** – Dynamic encryption algorithm selection
- **Strings** – Password handling and validation

---

## 🗂️ Project Structure

# File Encryption and Decryption Tool

## 📘 Project Overview

The **File Encryption and Decryption Tool** is a Java-based console application developed as a **Data Structures (CSM-228) mini project**.  
The project demonstrates how **Data Structures and Algorithms (DSA)** can be applied to real-world security problems by implementing multiple encryption and decryption techniques in a modular and memory-efficient manner.

The system supports **three encryption algorithms**:
- Caesar Cipher
- XOR Cipher
- AES (Advanced Encryption Standard)

The application allows users to securely encrypt and decrypt files using password-based encryption while efficiently handling large files using stream-based processing.

---

## 🎯 Objectives

- To implement file encryption and decryption using Java
- To apply Data Structures such as arrays, queues, and hash maps
- To support multiple encryption algorithms in a single tool
- To process files efficiently without loading entire files into memory
- To demonstrate modular and object-oriented design

---

## 🔐 Encryption Algorithms Implemented

### 1. Caesar Cipher
- Basic substitution cipher
- Shifts file bytes by a fixed value
- Used for algorithmic demonstration

### 2. XOR Cipher
- Symmetric encryption using bitwise XOR operation
- Same logic for encryption and decryption
- Efficient and fast

### 3. AES (Advanced Encryption Standard)
- Industry-standard symmetric encryption
- Uses password-based key generation
- Implemented using Java Cryptography Architecture (JCA)
- Provides strong real-world security

---

## 🧱 Data Structures Used

- **Arrays** – Byte-level file and key processing
- **Queue (FIFO)** – Chunk-based file encryption and decryption
- **HashMap** – Dynamic encryption algorithm selection
- **Strings** – Password handling and validation

---

## 🗂️ Project Structure

File-Encryption-Decryption-Tool/
│
├── Main.java
├── ConsoleUI.java
├── EncryptionAlgorithm.java
├── CaesarCipher.java
├── XorCipher.java
├── AESCipher.java
├── KeyGenerator.java
├── FileManager.java
├── Validator.java
├── ChecksumUtil.java
├── README.md

---

## 📄 File Descriptions

| File Name | Description |
|---------|-------------|
| `Main.java` | Application entry point and execution control |
| `ConsoleUI.java` | Handles user interaction and menu display |
| `EncryptionAlgorithm.java` | Common interface for all encryption algorithms |
| `CaesarCipher.java` | Caesar encryption and decryption logic |
| `XorCipher.java` | XOR encryption and decryption logic |
| `AESCipher.java` | AES encryption and decryption using JCA |
| `KeyGenerator.java` | Generates encryption keys from passwords |
| `FileManager.java` | Handles file reading and writing |
| `Validator.java` | Validates user input and file paths |
| `ChecksumUtil.java` | Ensures file integrity after processing |

---

## ⚙️ How It Works

1. User selects **Encrypt** or **Decrypt**
2. User selects an encryption algorithm
3. User provides file path and password
4. File is read in fixed-size chunks
5. Chunks are stored in a queue (FIFO)
6. Selected algorithm processes each chunk
7. Output file is generated securely
8. File integrity is verified

---

## ▶️ How to Run

### Prerequisites
- Java JDK 8 or above
- Command Line / Terminal

### Steps
'``bash
javac *.java
java Main

📊 Time and Space Complexity

Time Complexity: O(n), where n is the file size
Space Complexity: O(1) (constant extra space)

🚀 Future Enhancements

Add GUI using JavaFX or Swing
Add RSA encryption
Add digital signatures
Improve key management
Add compression before encryption

Author- Sangeeth s
