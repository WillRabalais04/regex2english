# !/bin/bash

if [ "$(pwd)" != "/usr/local/bin/regex2english" ]; then
    sudo mv "$(pwd)" "/usr/local/bin/"
fi

sudo chmod -R 700 "/usr/local/bin/regex2english"

# ALIAS_DIR="/dev/null"

# if test -f "$HOME/.zprofile"; then
#     echo "zsh user identified"
#     ALIAS_DIR="$HOME/.zprofile"
# fi
# if test -f "$HOME/.bashrc"; then
#     echo "bash user identified"
#     ALIAS_DIR="$HOME/.bashrc"
# fi

# echo "$ALIAS_DIR"

# echo "alias regex2english=\"/usr/local/bin/regex2english/run.sh\"" >> $ALIAS_DIR
# echo "alias r2e=\"/usr/local/bin/regex2english/run.sh\"" >> $ALIAS_DIR

