# Gym Membership Management System

A Java-based desktop application designed for **Iron Nation Fitness Club**. This system allows administrators to register new gym members, validate their inputs, and securely store their information in a local database (text file). The application features a user-friendly Graphical User Interface (GUI) built with **Java Swing**.

## 🚀 Features

* **Member Registration Form:** comprehensive data entry for:
* Personal Details (Name, DOB, Gender, Address)
* Contact Info (Phone, Email, Emergency Contact)
* Physical Stats (Weight, Height, Blood Group)


* **Input Validation:** Ensures that numeric fields (Phone, Weight, Height) contain valid numbers and checks that no fields are left empty.
* **File I/O Implementation:** Automatically saves member data into a local file (`./Data/userdata.txt`) with a timestamp.
* **Data View:** Reads and displays the history of registered members directly within the application.
* **Password Security:** Includes a "Show/Hide" toggle for the password field.

## 📂 Project Structure

The source code is organized into packages to separate concerns:

```
Gym-Management-System/
├── Start.java              # Entry point of the application
├── Frame/
│   └── FrameModel.java     # GUI design and Event handling (ActionListener)
├── Entity/
│   └── Member.java         # Data model and File I/O logic
├── Data/                   # Generated folder for storing member records
|    └── userdata.txt
└── Picture/                # Folder for UI assets (logos/images)
|    └── Iron Nation Fitness Club.png

```

## 🛠️ Prerequisites

* **Java Development Kit (JDK):** Version 8 or higher.
* **IDE (Optional):** IntelliJ IDEA, Eclipse, or NetBeans (or simply use the terminal).

## ⚙️ Installation & How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/gym-membership-system.git
cd gym-membership-system

```

### 2. Setup Directory Structure

Ensure your file hierarchy matches the package structure. Your folder should look like this:

* `Start.java` (in the root)
* Folder `Frame` containing `FrameModel.java`
* Folder `Entity` containing `Member.java`
* Folder `Picture` containing your logo image (e.g., `resize the logo for3 .png`)

### 3. Compile the Code

Open your terminal/command prompt in the root directory and run:

```bash
javac Start.java Frame/FrameModel.java Entity/Member.java

```

### 4. Run the Application

```bash
java Start

```

## 📸 Usage

1. **Fill Form:** Enter the member's details in the "Member Information Form" on the left panel.
2. **Submit:** Click the **SUBMIT** button.
* If successful, a confirmation message appears, and the data is saved to `Data/userdata.txt`.
* The member details will also appear in the scrollable text area on the right panel.


3. **Validation:** If you enter text in the "Weight" or "Phone" fields, the system will alert you to enter valid numbers.
4. **Exit:** Click **EXIT** to close the application.

## 📝 Data Storage

The application uses standard Java File I/O.

* Data is appended to: `./Data/userdata.txt`
* If the file or folder does not exist, the application creates it automatically upon the first submission.

## 🤝 Contributing

Contributions are welcome! If you want to improve the UI or add database connectivity (MySQL/SQLite):

1. Fork the Project.
2. Create your Feature Branch (`git checkout -b feature/NewFeature`).
3. Commit your Changes (`git commit -m 'Add some NewFeature'`).
4. Push to the Branch (`git push origin feature/NewFeature`).
5. Open a Pull Request.

## 📄 License

This project is free to use for educational purposes.

---

**Developed by [Mir Masnun Bin Zaman]**
