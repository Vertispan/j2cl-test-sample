To execute, run `mvn -Pdevmode` - there will be a stack trace at the end which you can ignore for now,
just a quirk of a local chromedriver not shutting down.

Right now it requires that chromedriver is on your PATH so that a browser can be started for the
test, but we'll update the tooling to support more RunStyle-like behavior (as GWT2 has) as the tool
gets formalized and made part of the gwt3 maven plugin.