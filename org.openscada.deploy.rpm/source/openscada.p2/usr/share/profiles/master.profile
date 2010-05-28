p2.create master
p2.install master org.openscada.deploy.feature.group com.inavare.projects.ossi.feature.group

uninstall org.openscada.ca.jdbc.default
uninstall org.openscada.ae.server.storage.jdbc.configuration
uninstall org.openscada.da.server.opc
uninstall org.openscada.da.server.stock
uninstall org.openscada.da.server.ice
uninstall org.openscada.da.server.sysinfo
uninstall org.openscada.da.server.proxy
uninstall org.openscada.da.server.dave
uninstall org.openscada.da.server.snmp
uninstall org.openscada.da.server.exec
uninstall org.openscada.da.server.simulation
uninstall org.openscada.da.server.simulation.component
uninstall org.openscada.da.server.test
uninstall org.openscada.da.server.spring
uninstall org.openscada.da.server.jdbc

start org.openscada.da.server.osgi.exporter.net
start org.openscada.da.client.net
start org.openscada.da.server.common.osgi
start org.openscada.da.connection.provider
start org.openscada.da.client.connection.service
start org.openscada.da.master.analyzer
start org.openscada.da.master.common
start org.openscada.da.datasource.script
start org.openscada.da.datasource.memory
start org.openscada.da.datasource.proxy
start org.openscada.da.datasource.item
start org.openscada.da.datasource.sum
start org.openscada.da.datasource.ds
start org.openscada.ca.servlet.jaxws
start org.openscada.ca.servlet
start org.openscada.ca.jdbc
start org.openscada.ds.storage.file
start org.openscada.utils.osgi.jaxws
start org.openscada.ae.event.logger
start org.openscada.ae.server.storage
start org.openscada.ae.server.exporter.net
start org.openscada.ae.event
start org.openscada.ae.server.net
start org.openscada.ae.monitor.dataitem
start org.openscada.ae.server.exporter
start org.openscada.ae.connection.provider
start org.openscada.ae.server.common
start org.openscada.ae.server.storage.jdbc
start org.openscada.ae.monitor.common
start org.openscada.ae.server.common.monitor
start org.openscada.ae.monitor
start org.openscada.ae.server.common.event
start org.openscada.da.server.osgi
start org.springframework.osgi.extender
start org.openscada.ae.server.storage.jdbc
start org.openscada.sec.provider.script
start com.inavare.ossi.sec.provider
start org.openscada.ae.server.http
start org.mortbay.jetty.server
start org.eclipse.equinox.http.jetty

openscada.da.net.exportUri=da:net://0.0.0.0:12040
org.openscada.utils.osgi.jaxws.baseAddress=http://0.0.0.0:9240
org.openscada.ds.storage.file.root=/home/inavare/ds/master_full
org.openscada.ae.server.storage.jdbc.password=test12
org.openscada.ae.server.storage.jdbc.username=jens
org.eclipse.equinox.http.jetty.http.port=8082
org.openscada.ca.jdbc.url=jdbc:oracle:thin:@(DESCRIPTION =     (ADDRESS = (PROTOCOL = TCP)(HOST = VS-IPT-RR1-HRN-11)(PORT = 1521))     (CONNECT_DATA =       (SID = VSIPT1)     )   )
org.openscada.ca.jdbc.username=tfms
org.openscada.ca.jdbc.password=oracle
org.openscada.ca.jdbc.schema=tfms
org.openscada.ca.jdbc.instance=master
org.openscada.ca.jdbc.fixNull=true
org.openscada.ae.server.storage.jdbc.url=jdbc:oracle:thin:@(DESCRIPTION =     (ADDRESS = (PROTOCOL = TCP)(HOST = VS-IPT-RR1-HRN-11)(PORT = 1521))     (CONNECT_DATA =       (SID = VSIPT1)     )   )
org.openscada.ae.server.storage.jdbc.username=tfms
org.openscada.ae.server.storage.jdbc.password=oracle
org.openscada.ae.server.storage.jdbc.schema=tfms
com.inavare.ossi.sec.provider.ignoreencryption=true
log4j.configuration=file:///home/inavare/master/log4j.properties
log4j.debug=true

