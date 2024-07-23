package de.dasbabypixel.migratorcape;

import com.destroystokyo.paper.profile.ProfileProperty;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class MigratorCape extends JavaPlugin implements Listener {
    private static final Map<UUID, ProfileProperty> MAP = Map.ofEntries(Stream
            .of(new Mapping(UUID.fromString("e604f7d9-e719-447c-afef-e0903d72faa5"), "ewogICJ0aW1lc3RhbXAiIDogMTcyMTY2Mjc5MTE5MywKICAicHJvZmlsZUlkIiA6ICIwOGQ4YzAwNmZiNTk0MDE1OWEzZGM3YzEyNzQxMzkzOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYXNCYWJ5UGl4ZWwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA1OGUxZWRiNzgxZGNlNTFiNTlmOGUzZjA0YWM2MzAyYmFhODUzMTQ2MmIyOTg0ZmNhZGYwMzIxODg3MjFiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0sCiAgICAiQ0FQRSIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjM0MGMwZTAzZGQyNGExMWIxNWE4YjMzYzJhN2U5ZTMyYWJiMjA1MWIyNDgxZDBiYTdkZWZkNjM1Y2E3YTkzMyIKICAgIH0KICB9Cn0=", "QaykXmlZhaWZUJqnxau6G4TK/j3N4qzC6wghUi55NbVFtsQRUjzXa5kClU0C3sWhCHa7LUPiWBOa1H1y5Es4XJpLrT2rpju6CoatOUZecKPPJij8hAssl/LmWBsOUnTMGX9E0v2Wp6SA74qEKRRiTT8+GlZ3zzRVJmuNYJbFY+oXJj/AD1FQ5A1eHIJgXn9HuSVnTel8hP6J9uS4+bhIjXpY+m7p0W+U5PsONO/Ai+wXe3i97ItFngl5ftXsQyvmtdIa1MAddNyU2l3sQUDiIrYR4EicJ+xhUiREJYCY2pi9IwAbd9E3/rJ1HbY4SsfKN52Vran5Pmt2ANdxg94QtB/Jzj6wBYclwgphadP7X8V+577jBkDU2+dyrUz5uSuA7RcT9Z/t2SX1rYNDbZvxeB1+wbWQETZXt8Zbf/9r/GyHb1K2Cb8cxBdr7896E+HO5jo6aP1d3PoVfAGeHteHj8HBPO8BrucOzpwA1T9igSlxjzlmFwmDIlvHhy+z+1qxCkCOKo7Gsk37+iXg7oP9FX7ItbYPYhzFxqIM516rOPRV+3SvyWuTYI93449JwRp4E0oEh5uq4Ju1vdJqXQPsfFtiI53y6yPE96LBIosKW6GumHCDeKsoNVTTLFC813AdCZqN6AhEEz/WyQ2P7MrRIPfLt5eRBVHxf3zjPRAynME="), new Mapping(UUID.fromString("1c688e59-be69-4023-b3e1-8cba47e5ff51"), "ewogICJ0aW1lc3RhbXAiIDogMTcyMTY2MTUzMzk4OCwKICAicHJvZmlsZUlkIiA6ICIwOGQ4YzAwNmZiNTk0MDE1OWEzZGM3YzEyNzQxMzkzOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYXNCYWJ5UGl4ZWwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTJiN2UzN2NkOTIwMDhmMGUyZmIzZmYzYWI5MWIyM2NhOGVlNmIzMzhjZDIzZGVmMWJiM2VhN2ZiZDljZWU2YyIKICAgIH0sCiAgICAiQ0FQRSIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjM0MGMwZTAzZGQyNGExMWIxNWE4YjMzYzJhN2U5ZTMyYWJiMjA1MWIyNDgxZDBiYTdkZWZkNjM1Y2E3YTkzMyIKICAgIH0KICB9Cn0=", "QIUrBmNsXQ7NMz3VjHkVpEPvq/KOKL+2gyN/d0OgJ6YDZ7b1hnE51YIQUp5uhI19LlyISA13lXJt+XLdyQRzgoB22tHsSBbmcEfhd2LyBd8yoeCAFD6Zvkctb2T0eQ1YKf3frjUDiqiHgs0TN3LhzyzqvcHaY72mGc3smmqYTMSbcJyVuofMbiuCyM/HPfv3edqpsCGZ8d8hVzXtqf188LORXuYwtTeqhU5h33FGTTXZkA5YKb9gJbtueXeZHXmV8wQqB+HyaOwiavuN60xLQbrt4jPcvnoNTFMZ08mbIPhqXMMHmZQzgd3kb3pRQN7LExx0L0U3ZGubNqUyabeBhULoNrpNmrFAdh9wOxveG01urBGdPe9TQlN6aEMKL5GCBjEMhJr7Z/YZ6JRSXb0BkrBh0vd8WZAQnOVpNNtlTQtIJs8Ua1OZaDkHUcrFVNMoPg4CVgZgy3y9EQevxnz85YDSyuAheL8XBtAmXvapAMQRNCtFkfGfczuXAs4Asb2hlVsSyVXXN5t570prcvFmB1s4JmVGAvw48NEkJmvNC+J7ReC5TYnszDoscD17y9YhXmRQGlQchrI2F7xjq37yMWX4YbktnWLYcOFQZ8x+jpJtyqTfJQoCZABywaBq9hVXC+rPh4hMGhxxxgz2p0Ffy4QqVK7zdGEgfJ+u1wKpIcA="))
            .map(m -> Map.entry(m.id, m.createProperty()))
            .toArray(Map.Entry[]::new));

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void handle(AsyncPlayerPreLoginEvent event) {
        var id = event.getUniqueId();
        event
                .getPlayerProfile()
                .getProperties()
                .stream()
                .filter(p -> p.getName().equals("textures"))
                .findFirst()
                .ifPresent(property -> getLogger().info("Player login " + event.getName() + " with textures " + property.getValue() + " -> " + property.getSignature()));

        if (MAP.containsKey(id)) {
            var property = MAP.get(id);
            var profile = event.getPlayerProfile();
            profile.setProperty(property);
            event.setPlayerProfile(profile);
        }
    }

    private record Mapping(UUID id, String value, String signature) {
        public ProfileProperty createProperty() {
            return new ProfileProperty("textures", value, signature);
        }
    }
}
