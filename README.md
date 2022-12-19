# Sample IR Optimizer Plugin for JEB's DEX Decompiler

Sample skeleton project to develop (in Java) and package (as a jar) an Intermediate Representation optimizer plugin for dexdec.

To build, make sure to have `JEB_HOME` set up to point to your JEB folder, and run one of the `build` scripts. The output jar will go to `out`. Copy the jar file to your JEB `coreplugins` folder.

To develop and debug with Eclipse, run one of the `create-eclipse-project` scripts to generate the Eclipse project files. You will be able to debug plugin code and use the usual IDE features (auto-completion, javadoc, etc.).

API reference: https://www.pnfsoftware.com/jeb/apidoc/reference/com/pnfsoftware/jeb/core/units/code/android/ir/package-summary.html

Blog: https://www.pnfsoftware.com/blog/writing-dexdec-ir-optimizer-plugins/