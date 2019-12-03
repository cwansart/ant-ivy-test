# Install datasource

To install the datasource start Wildfly by running, make sure you are inside the folder where the `wildfly.cli` resides and run the cli:

```
$ ./path/to/wildfly/bin/standanlone.sh
$ ./path/to/wildfly/bin/jboss-cli.sh --connect --file=wildfly.cli
{"outcome" => "success"}
```

*Note: This will only succeed if there is no postgres module installed into Wildfly.*
