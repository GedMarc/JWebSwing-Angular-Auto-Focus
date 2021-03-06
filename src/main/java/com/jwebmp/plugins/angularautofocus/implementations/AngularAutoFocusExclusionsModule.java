package com.jwebmp.plugins.angularautofocus.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularAutoFocusExclusionsModule
		implements IGuiceScanModuleExclusions<AngularAutoFocusExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularautofocus");
		return strings;
	}
}
