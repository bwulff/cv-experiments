FELIX_CACHE="./felix-cache"
rm -rf $FELIX_CACHE/*
java -Dorg.ops4j.pax.logging.DefaultServiceLog.level=INFO -jar bin/felix.jar $FELIX_CACHE 
