
default:

install:
	mkdir -p "$(DESTDIR)/usr/bin"
	install src/bin/osFunctions "$(DESTDIR)/usr/bin"
	install src/bin/osService "$(DESTDIR)/usr/bin"
	install src/bin/osDriverExporter "$(DESTDIR)/usr/bin"
	
	mkdir -p "$(DESTDIR)/usr/lib/perl5/openSCADA"
	install -m 0644 src/bin/openSCADA/Application.pm "$(DESTDIR)/usr/lib/perl5/openSCADA"
	install -m 0644 src/bin/openSCADA/Base.pm "$(DESTDIR)/usr/lib/perl5/openSCADA"
	install -m 0644 src/bin/openSCADA/JavaApplication.pm "$(DESTDIR)/usr/lib/perl5/openSCADA"

.PHONY: default install
