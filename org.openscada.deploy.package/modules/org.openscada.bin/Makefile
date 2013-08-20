
default:

install:
	mkdir -p "$(DESTDIR)/usr/bin"
	install src/bin/osFunctions "$(DESTDIR)/usr/bin"
	install src/bin/osService "$(DESTDIR)/usr/bin"
	install src/bin/osDriverExporter "$(DESTDIR)/usr/bin"
	install src/bin/hds-replicate-once "$(DESTDIR)/usr/bin"
	
	mkdir -p "$(DESTDIR)/usr/share/perl5/openSCADA"
	install -m 0644 src/bin/openSCADA/Application.pm "$(DESTDIR)/usr/share/perl5/openSCADA"
	install -m 0644 src/bin/openSCADA/Base.pm "$(DESTDIR)/usr/share/perl5/openSCADA"
	install -m 0644 src/bin/openSCADA/JavaApplication.pm "$(DESTDIR)/usr/share/perl5/openSCADA"
	
	mkdir -p "$(DESTDIR)/usr/share/doc/org.openscada.bin"
	install -m 0644 src/doc/hds.pull.conf.sample "$(DESTDIR)/usr/share/doc/org.openscada.bin"

.PHONY: default install
