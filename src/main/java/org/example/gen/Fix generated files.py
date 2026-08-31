import os

# Run from the generated-source directory; paths are relative to the working directory.
target_dir = "."
package_line = "package org.example.gen;\n"

files_to_fix = [
    "FlaskLexer.java",
    "FlaskParser.java",
    "FlaskParserListener.java",
    "FlaskParserBaseListener.java",
    "FlaskParserVisitor.java",
    "FlaskParserBaseVisitor.java",
]

for fname in files_to_fix:
    fpath = os.path.join(target_dir, fname)
    if not os.path.exists(fpath):
        print(f"SKIP (not found): {fname}")
        continue

    with open(fpath, "r", encoding="utf-8") as f:
        content = f.read()

    modified = False

    if "package org.example.gen" not in content:
        content = package_line + content
        modified = True
        print(f"ADDED package: {fname}")

    if "implements org.gen.FlaskParserVisitor" in content:
        content = content.replace(
            "implements org.gen.FlaskParserVisitor",
            "implements org.example.gen.FlaskParserVisitor"
        )
        modified = True
        print(f"FIXED implements: {fname}")

    if "import org.gen." in content:
        content = content.replace("import org.gen.", "import org.example.gen.")
        modified = True
        print(f"FIXED import: {fname}")

    if modified:
        with open(fpath, "w", encoding="utf-8") as f:
            f.write(content)
    else:
        print(f"OK: {fname}")

print("\nDone!")