# Eclipse Setup Guide

Complete guide for importing and running this project in Eclipse IDE.

## Prerequisites

1. **Eclipse IDE for Java Developers** (2020-06 or later)
   - Download from: https://www.eclipse.org/downloads/

2. **Java JDK 11 or later**
   - Verify installation: `java -version`

3. **Maven** (bundled with Eclipse, or standalone)
   - Eclipse includes M2Eclipse plugin by default

## Method 1: Import as Maven Project (Recommended)

### Step 1: Import the Project

1. Open Eclipse
2. Go to **File → Import...**
3. Expand **Maven** folder
4. Select **Existing Maven Projects**
5. Click **Next**

### Step 2: Select Project Directory

1. Click **Browse** next to "Root Directory"
2. Navigate to: `C:\Workspace\Execute.SingAlone-Me-`
3. Click **Select Folder**
4. Eclipse will detect `pom.xml`
5. Ensure the project checkbox is selected
6. Click **Finish**

### Step 3: Wait for Maven to Download Dependencies

- Eclipse will automatically download dependencies (JavaFX, JLayer)
- Check progress in bottom-right corner
- This may take 1-5 minutes on first import

### Step 4: Verify Project Structure

Your Package Explorer should show:

```
world-execute-me
├── src/main/java
│   └── com.worldexecute
│       ├── Main.java
│       ├── ConsoleUtils.java
│       ├── TextAnimator.java
│       ├── FileReaderUtil.java
│       ├── AudioPlayer.java
│       └── WorldExecute.java
├── src/main/resources
│   └── textFiles/
├── src/test/java
├── JRE System Library [JavaSE-11]
├── Maven Dependencies
└── pom.xml
```

### Step 5: Configure Java Version (if needed)

If Eclipse shows Java version errors:

1. Right-click project → **Properties**
2. Select **Java Compiler**
3. Set **Compiler compliance level** to **11** or higher
4. Click **Apply and Close**

## Running the Project

### Running via Eclipse
1. Open **Main.java**
2. Right-click in editor → **Run As → Java Application**
3. Enter password in Console view: `run world.exec`

### Running via cmd

1. Locate to folder root
2. ```mvn clean package```
3. ```java -cp target/classes com.worldexecute.Main```
4. Enter password in Console view: `run world.exec`

## Eclipse Console Configuration

### Enable ANSI Color Support

Eclipse 2022-03+ has built-in ANSI color support:

1. **Window → Preferences**
2. Navigate to **Run/Debug → Console**
3. Check **Interpret ASCII control characters** (or **Interpret ANSI escape sequences**)
4. Click **Apply and Close**

For older Eclipse versions:
- Install **ANSI Escape in Console** plugin:
  1. **Help → Eclipse Marketplace**
  2. Search for "ANSI Escape in Console"
  3. Install and restart Eclipse

### Increase Console Buffer (Optional)

For long output:

1. **Window → Preferences**
2. **Run/Debug → Console**
3. Check **Limit console output**
4. Set to **100000** characters
5. Click **Apply**

## Building the Project

### Build JAR via Eclipse

1. Right-click **pom.xml**
2. **Run As → Maven build...**
3. **Goals**: `clean package`
4. Click **Run**
5. JAR created in `target/` folder

### Run the JAR

```bash
# From project root
java -jar target/world-execute-me-1.0.0.jar
```

## Troubleshooting

### Problem: "Could not find or load main class"

**Solution**:
1. Right-click project → **Maven → Update Project**
2. Check **Force Update of Snapshots/Releases**
3. Click **OK**

### Problem: Package declarations show errors

**Solution**:
1. Ensure all Java files are in correct package structure
2. **Project → Clean...**
3. Select project and click **Clean**

### Problem: Maven dependencies not downloading

**Solution**:
1. Check internet connection
2. Right-click project → **Maven → Update Project**
3. Or: **Run As → Maven build** with goal `dependency:resolve`

### Problem: Console not showing colors

**Solutions**:
- Use Eclipse 2022-03 or later
- Install "ANSI Escape in Console" plugin
- Or run from external terminal (see below)

## Running from External Terminal

For best ANSI color support:

### Windows Terminal / PowerShell
```bash
cd C:\Workspace\world.execute(me)-
mvn clean package
java -jar target/world-execute-me-1.0.0.jar
```

### Command Prompt
```bash
cd C:\Workspace\world.execute(me)-
mvn clean package
java -jar target\world-execute-me-1.0.0.jar
```