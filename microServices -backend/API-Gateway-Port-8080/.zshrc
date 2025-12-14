
# >>> conda initialize >>>
# !! Contents within this block are managed by 'conda init' !!
__conda_setup="$('/opt/anaconda3/bin/conda' 'shell.zsh' 'hook' 2> /dev/null)"
if [ $? -eq 0 ]; then
    eval "$__conda_setup"
else
    if [ -f "/opt/anaconda3/etc/profile.d/conda.sh" ]; then
        . "/opt/anaconda3/etc/profile.d/conda.sh"
    else
        export PATH="/opt/anaconda3/bin:$PATH"
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH    fi
fi
unset __conda_setup
# <<< conda initialize <<<
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.0.12.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PAT
export PATH="$HOME/.composer/vendor/bin:$PATH"
export PATH="$HOME/.composer/vendor/bin:$PATH"
